package fronteira;

import entidades.Veiculo;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class tela_manter_veiculo extends javax.swing.JFrame {

    public tela_manter_veiculo() {
        initComponents();
        this.setTitle("Cadastro e Gerenciamento de Veículos");
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
        listarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JMARKETPLACE = new javax.swing.JLabel();
        jtitulo_cadastro = new javax.swing.JLabel();
        jButton_novo = new javax.swing.JButton();
        jButton_alterar = new javax.swing.JButton();
        jButton_excluir = new javax.swing.JButton();
        jButton_limpar = new javax.swing.JButton();
        jButton_listar = new javax.swing.JButton();
        jButton_salvar = new javax.swing.JButton();
        jsubtitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jtitulo_chassi = new javax.swing.JLabel();
        jtext_chassii = new javax.swing.JTextField();
        jButton_buscar = new javax.swing.JButton();
        jtitulo_placa = new javax.swing.JLabel();
        jtext_placaa = new javax.swing.JTextField();
        jtitulo_modelo = new javax.swing.JLabel();
        jtext_modeloo = new javax.swing.JTextField();
        jtitulo_ano = new javax.swing.JLabel();
        jtext_anoo = new javax.swing.JTextField();
        jtext_cor = new javax.swing.JTextField();
        jtitulo_cor = new javax.swing.JLabel();
        jtitulo_grupo = new javax.swing.JLabel();
        jtext_gp_veiculo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jtitulo_preço = new javax.swing.JLabel();
        jtext_preço = new javax.swing.JTextField();
        jtitulo_status = new javax.swing.JLabel();
        jtext_statuss = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVeiculo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JMARKETPLACE.setFont(new java.awt.Font("Eras Medium ITC", 0, 36)); // NOI18N
        JMARKETPLACE.setForeground(new java.awt.Color(255, 255, 0));
        JMARKETPLACE.setText("Marketplace");

        jtitulo_cadastro.setBackground(new java.awt.Color(255, 255, 255));
        jtitulo_cadastro.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jtitulo_cadastro.setForeground(new java.awt.Color(255, 255, 255));
        jtitulo_cadastro.setText("Cadastro e Gerenciamento de veículos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtitulo_cadastro)
                    .addComponent(JMARKETPLACE, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JMARKETPLACE, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtitulo_cadastro)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jButton_novo.setBackground(new java.awt.Color(0, 0, 0));
        jButton_novo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_novo.setForeground(new java.awt.Color(255, 255, 51));
        jButton_novo.setText("Novo");
        jButton_novo.setBorderPainted(false);
        jButton_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_novoActionPerformed(evt);
            }
        });

        jButton_alterar.setBackground(new java.awt.Color(0, 0, 0));
        jButton_alterar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_alterar.setForeground(new java.awt.Color(255, 255, 51));
        jButton_alterar.setText("Alterar");
        jButton_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_alterarActionPerformed(evt);
            }
        });

        jButton_excluir.setBackground(new java.awt.Color(0, 0, 0));
        jButton_excluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_excluir.setForeground(new java.awt.Color(255, 255, 51));
        jButton_excluir.setText("Excluir");
        jButton_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_excluirActionPerformed(evt);
            }
        });

        jButton_limpar.setBackground(new java.awt.Color(0, 0, 0));
        jButton_limpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_limpar.setForeground(new java.awt.Color(255, 255, 51));
        jButton_limpar.setText("Limpar");
        jButton_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_limparActionPerformed(evt);
            }
        });

        jButton_listar.setBackground(new java.awt.Color(0, 0, 0));
        jButton_listar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_listar.setForeground(new java.awt.Color(255, 255, 51));
        jButton_listar.setText("Listar");
        jButton_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_listarActionPerformed(evt);
            }
        });

        jButton_salvar.setBackground(new java.awt.Color(255, 255, 51));
        jButton_salvar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_salvar.setText("Salvar");
        jButton_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salvarActionPerformed(evt);
            }
        });

        jsubtitulo.setBackground(new java.awt.Color(255, 255, 51));
        jsubtitulo.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jsubtitulo.setText("Dados do Veículo");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jtitulo_chassi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtitulo_chassi.setText("Chassi");

        jtext_chassii.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtext_chassii.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtext_chassii.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtext_chassiiActionPerformed(evt);
            }
        });

        jButton_buscar.setBackground(new java.awt.Color(0, 0, 0));
        jButton_buscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_buscar.setForeground(new java.awt.Color(255, 255, 51));
        jButton_buscar.setText("Buscar");
        jButton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscarActionPerformed(evt);
            }
        });

        jtitulo_placa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtitulo_placa.setText("Placa");

        jtext_placaa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtext_placaa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtext_placaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtext_placaaActionPerformed(evt);
            }
        });

        jtitulo_modelo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtitulo_modelo.setText("Modelo");

        jtext_modeloo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtext_modeloo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtext_modeloo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtext_modelooActionPerformed(evt);
            }
        });

        jtitulo_ano.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtitulo_ano.setText("Ano");

        jtext_anoo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtext_anoo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtext_anoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtext_anooActionPerformed(evt);
            }
        });

        jtext_cor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtext_cor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtext_cor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtext_corActionPerformed(evt);
            }
        });

        jtitulo_cor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtitulo_cor.setText("Cor");

        jtitulo_grupo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtitulo_grupo.setText("Grupo Veículo");

        jtext_gp_veiculo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtext_gp_veiculo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtext_gp_veiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtext_gp_veiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jtitulo_cor))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtitulo_modelo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtitulo_chassi)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtext_chassii, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jtext_cor, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtext_modeloo, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jtitulo_placa)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtext_placaa, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jtitulo_ano)
                            .addGap(18, 18, 18)
                            .addComponent(jtext_anoo)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtitulo_grupo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtext_gp_veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtext_chassii, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtitulo_chassi)
                    .addComponent(jButton_buscar)
                    .addComponent(jtext_placaa)
                    .addComponent(jtitulo_placa))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtitulo_modelo)
                    .addComponent(jtext_modeloo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtext_anoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtitulo_ano))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtext_cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtitulo_cor)
                    .addComponent(jtext_gp_veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtitulo_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jtitulo_preço.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtitulo_preço.setText("Preço FIPE");

        jtext_preço.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtext_preço.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtext_preço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtext_preçoActionPerformed(evt);
            }
        });

        jtitulo_status.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtitulo_status.setText("Status");

        jtext_statuss.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtext_statuss.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jtext_statuss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtext_statussActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtitulo_preço)
                    .addComponent(jtitulo_status))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jtext_statuss, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtext_preço, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtitulo_preço)
                    .addComponent(jtext_preço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtitulo_status)
                    .addComponent(jtext_statuss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Valores e operação");

        tblVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Chassi", "Placa", "Modelo", "Cor", "Ano", "Preço FIPE", "Status", "Grupo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVeiculo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_listar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jsubtitulo))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jsubtitulo)
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_listar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtext_corActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtext_corActionPerformed
    }//GEN-LAST:event_jtext_corActionPerformed

    private void jtext_placaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtext_placaaActionPerformed
    }//GEN-LAST:event_jtext_placaaActionPerformed

    private void jtext_chassiiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtext_chassiiActionPerformed
    }//GEN-LAST:event_jtext_chassiiActionPerformed

    private void jtext_statussActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtext_statussActionPerformed
    }//GEN-LAST:event_jtext_statussActionPerformed

    private void jtext_preçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtext_preçoActionPerformed
    }//GEN-LAST:event_jtext_preçoActionPerformed

    private void jtext_modelooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtext_modelooActionPerformed
    }//GEN-LAST:event_jtext_modelooActionPerformed

    private void jtext_anooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtext_anooActionPerformed
    }//GEN-LAST:event_jtext_anooActionPerformed

    private void jtext_gp_veiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtext_gp_veiculoActionPerformed
    }//GEN-LAST:event_jtext_gp_veiculoActionPerformed

    private void jButton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscarActionPerformed
        try {
            String chassi = jtext_chassii.getText().trim();
            if (chassi.isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Digite o Chassi para buscar o veículo!",
                        "AVISO",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            Veiculo v = new Veiculo();
            v.setChassi(chassi);
            v = v.findOneVeiculo(v);

            if (v.getPlaca() == null || v.getPlaca().isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Veículo não encontrado no banco de dados!",
                        "AVISO",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            jtext_placaa.setText(v.getPlaca());
            jtext_modeloo.setText(v.getModelo());
            jtext_anoo.setText(String.valueOf(v.getAno()));
            jtext_cor.setText(v.getCor());
            jtext_gp_veiculo.setText(String.valueOf(v.getIdGrupo()));
            jtext_preço.setText(String.valueOf(v.getPrecoFIPE()));
            jtext_statuss.setText(v.getStatusVeiculo());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage(),
                    "ERRO NO BANCO",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_buscarActionPerformed

    private void jButton_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_novoActionPerformed
        limpaCampos();
        jtext_chassii.setEditable(true);
        jtext_placaa.setEditable(true);
        jtext_modeloo.setEditable(true);
        jtext_anoo.setEditable(true);
        jtext_cor.setEditable(true);
        jtext_gp_veiculo.setEditable(true);
        jtext_preço.setEditable(true);
        jtext_statuss.setEditable(true);
    }//GEN-LAST:event_jButton_novoActionPerformed

    private void jButton_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_alterarActionPerformed
        try {
            Veiculo v = new Veiculo();
            v.setChassi(jtext_chassii.getText());
            v.setPlaca(jtext_placaa.getText());
            v.setModelo(jtext_modeloo.getText());
            v.setAno(Integer.parseInt(jtext_anoo.getText()));
            v.setCor(jtext_cor.getText());
            v.setIdGrupo(Integer.parseInt(jtext_gp_veiculo.getText()));
            v.setPrecoFIPE(Double.parseDouble(jtext_preço.getText().replace(",", ".")));
            v.setStatusVeiculo(jtext_statuss.getText());

            v.updateVeiculo(v);

            JOptionPane.showMessageDialog(null,
                    "Veículo alterado com sucesso!",
                    "SUCESSO",
                    JOptionPane.INFORMATION_MESSAGE);
            limpaCampos();
            listarTabela();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Confira os campos numéricos (Ano, Grupo Veículo e Preço FIPE)!",
                    "ERRO DE DIGITAÇÃO",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage(),
                    "ERRO NO BANCO",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_alterarActionPerformed

    private void jButton_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_excluirActionPerformed
        try {
            Veiculo v = new Veiculo();
            v.setChassi(jtext_chassii.getText());

            v.deleteVeiculo(v);

            JOptionPane.showMessageDialog(null,
                    "Veículo excluído com sucesso!",
                    "SUCESSO",
                    JOptionPane.INFORMATION_MESSAGE);
            limpaCampos();
            listarTabela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage(),
                    "ERRO NO BANCO",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_excluirActionPerformed

    private void jButton_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_limparActionPerformed
        limpaCampos();
    }//GEN-LAST:event_jButton_limparActionPerformed

    private void jButton_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_listarActionPerformed
        listarTabela();
    }//GEN-LAST:event_jButton_listarActionPerformed

    private void jButton_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salvarActionPerformed
        try {
            Veiculo v = new Veiculo();
            v.setChassi(jtext_chassii.getText());
            v.setPlaca(jtext_placaa.getText());
            v.setModelo(jtext_modeloo.getText());
            v.setAno(Integer.parseInt(jtext_anoo.getText()));
            v.setCor(jtext_cor.getText());
            v.setIdGrupo(Integer.parseInt(jtext_gp_veiculo.getText()));
            v.setPrecoFIPE(Double.parseDouble(jtext_preço.getText().replace(",", ".")));
            v.setStatusVeiculo(jtext_statuss.getText());

            v.insertVeiculo(v);

            JOptionPane.showMessageDialog(null,
                    "Veículo cadastrado com sucesso!",
                    "SUCESSO",
                    JOptionPane.INFORMATION_MESSAGE);
            limpaCampos();
            listarTabela();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Digite números válidos nos campos Ano, Grupo Veículo (ID) e Preço FIPE!",
                    "ERRO DE DIGITAÇÃO",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage(),
                    "ERRO NO BANCO",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_salvarActionPerformed

    public void listarTabela() {
        try {
            Veiculo v = new Veiculo();
            List<Veiculo> lista = v.findAllVeiculo();
            DefaultTableModel model = (DefaultTableModel) tblVeiculo.getModel();
            model.setRowCount(0);
            for (Veiculo veic : lista) {
                Object[] linha = new Object[8];
                linha[0] = veic.getChassi();
                linha[1] = veic.getPlaca();
                linha[2] = veic.getModelo();
                linha[3] = veic.getCor();
                linha[4] = veic.getAno();
                linha[5] = veic.getPrecoFIPE();
                linha[6] = veic.getStatusVeiculo();
                linha[7] = veic.getIdGrupo();
                model.addRow(linha);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage(),
                    "ERRO AO LISTAR",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void limpaCampos() {
        jtext_chassii.setText("");
        jtext_placaa.setText("");
        jtext_modeloo.setText("");
        jtext_anoo.setText("");
        jtext_cor.setText("");
        jtext_gp_veiculo.setText("");
        jtext_preço.setText("");
        jtext_statuss.setText("");
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tela_manter_veiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_manter_veiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_manter_veiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_manter_veiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_manter_veiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JMARKETPLACE;
    private javax.swing.JButton jButton_alterar;
    private javax.swing.JButton jButton_buscar;
    private javax.swing.JButton jButton_excluir;
    private javax.swing.JButton jButton_limpar;
    private javax.swing.JButton jButton_listar;
    private javax.swing.JButton jButton_novo;
    private javax.swing.JButton jButton_salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jsubtitulo;
    private javax.swing.JTextField jtext_anoo;
    private javax.swing.JTextField jtext_chassii;
    private javax.swing.JTextField jtext_cor;
    private javax.swing.JTextField jtext_gp_veiculo;
    private javax.swing.JTextField jtext_modeloo;
    private javax.swing.JTextField jtext_placaa;
    private javax.swing.JTextField jtext_preço;
    private javax.swing.JTextField jtext_statuss;
    private javax.swing.JLabel jtitulo_ano;
    private javax.swing.JLabel jtitulo_cadastro;
    private javax.swing.JLabel jtitulo_chassi;
    private javax.swing.JLabel jtitulo_cor;
    private javax.swing.JLabel jtitulo_grupo;
    private javax.swing.JLabel jtitulo_modelo;
    private javax.swing.JLabel jtitulo_placa;
    private javax.swing.JLabel jtitulo_preço;
    private javax.swing.JLabel jtitulo_status;
    private javax.swing.JTable tblVeiculo;
    // End of variables declaration//GEN-END:variables
}