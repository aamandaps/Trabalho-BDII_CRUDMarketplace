USE Marketplace
GO

-- ==========================================
-- 1. TABELAS INDEPENDENTES
-- ==========================================
CREATE TABLE endereco (                                 -- Constraints nível coluna
	id				INT				NOT NULL,
	logradouro		VARCHAR(200)	NOT NULL,
	complemento		VARCHAR(200)	NOT NULL,
	num				INT				NOT NULL			CHECK(num > 0),
	cep				CHAR(8)			NOT NULL			CHECK(LEN(cep) = 8) 

	-- Constraints nível tabela
	PRIMARY KEY(id) 
)
GO


CREATE TABLE funcionario (                              -- Constraints nível coluna
	cpf				VARCHAR(11)		NOT NULL			CHECK(LEN(cpf) = 11),
	nome			VARCHAR(100)	NOT NULL,
	email			VARCHAR(100)	NOT NULL			UNIQUE,	

	-- Constraints nível tabela
	PRIMARY KEY(cpf) 
)
GO


CREATE TABLE grupoVeiculo (                             -- Constraints nível coluna
	id				INT				NOT NULL			IDENTITY(200,1),
	tipo			VARCHAR(50)		NOT NULL			UNIQUE,			
	preco_diaria	DECIMAL(10,2)	NOT NULL			CHECK(preco_diaria > 0)

	-- Constraints nível tabela
	PRIMARY KEY(id)
)
GO


CREATE TABLE protecao (                                 -- Constraints nível coluna
	id				INT				NOT NULL			IDENTITY(0,1),
	nome			VARCHAR(60)		NOT NULL			UNIQUE,
	descricao		VARCHAR(200)	NOT NULL,
	valorDiaria		DECIMAL(10,2)	NOT NULL			CHECK(valorDiaria >= 0)

	-- Constraints nível tabela
	PRIMARY KEY(id) 
)
GO


-- ==========================================
-- 2. TABELAS COM DEPENDÊNCIA DE NÍVEL 1
-- ==========================================
CREATE TABLE cliente (                                  -- Constraints nível coluna
	id				VARCHAR(14)		NOT NULL			CHECK(LEN(id) = 11 OR LEN(id) = 14), -- Verificando se é PF ou PJ
	nome			VARCHAR(60)		NOT NULL,		
	habilitacao		VARCHAR(20)		NOT NULL			UNIQUE,
	telefone		CHAR(11)		NOT NULL			CHECK(LEN(telefone) = 11),
	email			VARCHAR(100)	NOT NULL			UNIQUE,
	enderecoID		INT				NOT NULL			UNIQUE,

	-- Constraints nível tabela
	PRIMARY KEY(id),
	FOREIGN KEY(enderecoID) REFERENCES endereco(id) 
)
GO


CREATE TABLE veiculo (									-- Constraints nível coluna
	chassi			CHAR(17)		NOT NULL			CHECK(LEN(chassi) = 17),
	placa			VARCHAR(8)		NOT NULL			UNIQUE,
	modelo			VARCHAR(20)		NOT NULL,
	cor				VARCHAR(20)		NOT NULL,
	ano				INT				NOT NULL			CHECK(ano > 1990),
	precoFIPE		DECIMAL(10,2)	NOT NULL			CHECK(precoFIPE > 0),
	statusVeiculo	VARCHAR(60)		NOT NULL			DEFAULT ('Disponível') 
														CHECK(statusVeiculo IN ('Disponível', 'Locado', 'Em Manutenção', 'Desativado')),
	id_grupo		INT				NOT NULL 
	
	-- Constraints nível tabela
	PRIMARY KEY(chassi),
	FOREIGN KEY(id_grupo) REFERENCES grupoVeiculo(id) 
)
GO


-- ==========================================
-- 3. TABELAS COM DEPENDÊNCIA DE NÍVEL 2
-- ==========================================
CREATE TABLE manutencao (								-- Constraints nível coluna
	id				INT				NOT NULL			IDENTITY(1000,1),
	dataManutencao	DATETIME		NOT NULL			CHECK(dataManutencao >= GETDATE()), -- GETDATE() impede que uma data passada seja cadastrada
	descricao		VARCHAR(200)	NOT NULL,
	custo			DECIMAL(10,2)	NOT NULL			CHECK(custo >= 0),
	veiculoChassi	CHAR(17)		NOT NULL

	-- Constraints nível tabela
	PRIMARY KEY(id),
	FOREIGN KEY(veiculoChassi) REFERENCES veiculo(chassi) 
)
GO


CREATE TABLE reserva (								    -- Constraints nível coluna
	id				INT				NOT NULL			IDENTITY(10000, 1),
	dt_retirada		DATETIME		NOT NULL			CHECK(dt_retirada >= GETDATE()),
	dt_devolucao	DATETIME		NOT NULL,
	valor_total		DECIMAL(10,2)	NOT NULL			CHECK(valor_total > 0),
	statusReserva	VARCHAR(20)		NOT NULL			DEFAULT ('Pendente')
														CHECK(statusReserva IN ('Pendente', 'Confirmada', 'Cancelada', 'Concluída')),
	clienteID		VARCHAR(14)		NOT NULL,
	grupoID			INT				NOT NULL,
	veiculoID		CHAR(17)		NOT NULL,
	protecaoID		INT				NOT NULL

	-- Constraints nível tabela
	PRIMARY KEY(id),
	FOREIGN KEY(clienteID) REFERENCES cliente(id),
	FOREIGN KEY(grupoID) REFERENCES grupoVeiculo(id),
	FOREIGN KEY(veiculoID) REFERENCES veiculo(chassi),
	FOREIGN KEY(protecaoID) REFERENCES protecao(id), 
	-- Verificação necessária para os requisitos RF08, RF09, RF10
	CONSTRAINT chk_duracao_reserva 
		CHECK (dt_devolucao >= dt_retirada + 1 AND dt_devolucao <= dt_retirada + 7) 
)
GO


-- ==========================================
-- 4. TABELAS COM DEPENDÊNCIA DE NÍVEL 3
-- ==========================================
CREATE TABLE contrato (									-- Constraints nível coluna
	id				INT				NOT NULL			IDENTITY(30000, 1), 
	termos			VARCHAR(200)	NOT NULL,
	assinatura		VARCHAR(60)		NOT NULL,
	dtHora_Geracao	DATETIME		NOT NULL			DEFAULT GETDATE(),
	reservaID		INT				NOT NULL			UNIQUE,

	-- Constraints nível tabela
	PRIMARY KEY(id),
	FOREIGN KEY(reservaID) REFERENCES reserva(id) 
)
GO


CREATE TABLE locacao (									-- Constraints nível coluna
	id					INT				NOT NULL		IDENTITY(60000, 1),
	dtHr_Retirada		DATETIME		NOT NULL,
	dtHr_Devolucao		DATETIME		NOT NULL,
	statusLocacao		VARCHAR(60)		NOT NULL		DEFAULT('Em andamento')
														CHECK (statusLocacao IN ('Em andamento', 'Finalizada', 'Cancelada')),
	descricaoValores	VARCHAR(200)	NOT NULL,
	reservaID			INT				NOT NULL		UNIQUE,
	veiculoChassi		CHAR(17)		NOT NULL

	-- Constraints nível tabela
	PRIMARY KEY(id),
	FOREIGN KEY(reservaID) REFERENCES reserva(id),
	FOREIGN KEY(veiculoChassi) REFERENCES veiculo(chassi),
	CONSTRAINT chk_duracao_locacao 
		CHECK (dtHr_Devolucao > dtHr_Retirada) 
)
GO


CREATE TABLE pagamento (								-- Constraints nível coluna
	id					INT				NOT NULL		IDENTITY(80000, 1),
	dtHora				DATETIME		NOT NULL		DEFAULT GETDATE(),
	tipo				VARCHAR(20)		NOT NULL		CHECK(tipo IN ('Diárias', 'Pré-autorização')),
	statusPagamento		VARCHAR(20)		NOT NULL		DEFAULT('Pendente')
														CHECK(statusPagamento IN ('Pendente', 'Aprovado', 'Recusado', 'Estornado')),
	reservaID			INT				NOT NULL

	-- Constraints nível tabela
	PRIMARY KEY(id),
	FOREIGN KEY(reservaID) REFERENCES reserva(id) 
)
GO


-- ==========================================
-- 5. TABELAS COM DEPENDÊNCIA DE NÍVEL 4
-- ==========================================
CREATE TABLE inspecao (
	id				INT				NOT NULL			IDENTITY(100000, 1),
	descricao		VARCHAR(200)	NOT NULL,
	relatorio		VARCHAR(200)	NOT NULL,
	locacaoID		INT				NOT NULL 

	-- Constraints nível tabela
	PRIMARY KEY(id),
	FOREIGN KEY(locacaoID) REFERENCES locacao(id) 
)
GO

-- Tabelas que serão utilizadas no java
SELECT * FROM grupoVeiculo;
SELECT * FROM veiculo;
