package fronteira;

import entidades.GrupoVeiculo;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class tela_GrupoVeiculo extends javax.swing.JFrame  {

    public tela_GrupoVeiculo() {
        initComponents();
        this.setTitle("Cadastro e Gerenciamento de Grupos de Veículos");
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
        listarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JMARKETPLACE = new javax.swing.JLabel();
        jtitulo_cadastro = new javax.swing.JLabel();
        jsubtitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jtitulo_id = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jButton_buscar = new javax.swing.JButton();
        jtitulo_tipo = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jtitulo_preco = new javax.swing.JLabel();
        txtPrecoDiaria = new javax.swing.JTextField();
        jButton_novo = new javax.swing.JButton();
        jButton_alterar = new javax.swing.JButton();
        jButton_limpar = new javax.swing.JButton();
        jButton_excluir = new javax.swing.JButton();
        jButton_listar = new javax.swing.JButton();
        jButton_salvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGrupoVeiculo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JMARKETPLACE.setFont(new java.awt.Font("Eras Medium ITC", 0, 36)); // NOI18N
        JMARKETPLACE.setForeground(new java.awt.Color(255, 255, 0));
        JMARKETPLACE.setText("Marketplace");

        jtitulo_cadastro.setBackground(new java.awt.Color(255, 255, 255));
        jtitulo_cadastro.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jtitulo_cadastro.setForeground(new java.awt.Color(255, 255, 255));
        jtitulo_cadastro.setText("Cadastro e Gerenciamento de Grupos de Veículos");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jsubtitulo.setBackground(new java.awt.Color(255, 255, 51));
        jsubtitulo.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jsubtitulo.setText("Dados do Grupo de Veículos");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jtitulo_id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtitulo_id.setText("ID");

        txtID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButton_buscar.setBackground(new java.awt.Color(0, 0, 0));
        jButton_buscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_buscar.setForeground(new java.awt.Color(255, 255, 51));
        jButton_buscar.setText("Buscar");
        jButton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscarActionPerformed(evt);
            }
        });

        jtitulo_tipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtitulo_tipo.setText("Tipo");

        txtTipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTipo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jtitulo_preco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtitulo_preco.setText("Preço Diária");

        txtPrecoDiaria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPrecoDiaria.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtitulo_id)
                    .addComponent(jtitulo_tipo))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTipo))
                .addGap(48, 48, 48)
                .addComponent(jtitulo_preco)
                .addGap(18, 18, 18)
                .addComponent(txtPrecoDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtitulo_id)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_buscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtitulo_tipo)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtitulo_preco)
                    .addComponent(txtPrecoDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
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

        jButton_limpar.setBackground(new java.awt.Color(0, 0, 0));
        jButton_limpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_limpar.setForeground(new java.awt.Color(255, 255, 51));
        jButton_limpar.setText("Limpar");
        jButton_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_limparActionPerformed(evt);
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

        tblGrupoVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo", "Preço Diária"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblGrupoVeiculo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jButton_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jsubtitulo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jsubtitulo)
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_listar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscarActionPerformed
        try {
            String idTexto = txtID.getText().trim();
            if (idTexto.isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Digite o ID para buscar o grupo!",
                        "AVISO",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            GrupoVeiculo gv = new GrupoVeiculo();
            gv.setId(Integer.parseInt(idTexto));
            gv = gv.findOneGrupoVeiculo(gv);

            if (gv.getTipo() == null || gv.getTipo().isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Grupo de veículo não encontrado no banco de dados!",
                        "AVISO",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            txtID.setText(String.valueOf(gv.getId()));
            txtTipo.setText(gv.getTipo());
            txtPrecoDiaria.setText(String.valueOf(gv.getPrecoDiaria()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Digite um ID numérico inteiro válido!",
                    "ERRO DE DIGITAÇÃO",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage(),
                    "ERRO NO BANCO",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_buscarActionPerformed

    private void jButton_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_novoActionPerformed
        limpaCampos();
        txtID.setEditable(true);
        txtTipo.setEditable(true);
        txtPrecoDiaria.setEditable(true);
    }//GEN-LAST:event_jButton_novoActionPerformed

    private void jButton_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_alterarActionPerformed
        try {
            int id = Integer.parseInt(txtID.getText().trim());
            String tipo = txtTipo.getText().trim();
            double precoDiaria = Double.parseDouble(txtPrecoDiaria.getText().trim().replace(",", "."));

            if (tipo.isEmpty() || tipo.length() > 50 || precoDiaria <= 0) {
                JOptionPane.showMessageDialog(null,
                        "Confira o Tipo (1 a 50 caracteres) e o Preço Diária (> 0)!",
                        "AVISO",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            GrupoVeiculo gv = new GrupoVeiculo();
            gv.setId(id);
            gv.setTipo(tipo);
            gv.setPrecoDiaria(precoDiaria);

            gv.updateGrupoVeiculo(gv);

            JOptionPane.showMessageDialog(null,
                    "Grupo de veículo alterado com sucesso!",
                    "SUCESSO",
                    JOptionPane.INFORMATION_MESSAGE);
            limpaCampos();
            listarTabela();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Confira os campos numéricos (ID e Preço Diária)!",
                    "ERRO DE DIGITAÇÃO",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage(),
                    "ERRO NO BANCO",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_alterarActionPerformed

    private void jButton_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_limparActionPerformed
        limpaCampos();
    }//GEN-LAST:event_jButton_limparActionPerformed

    private void jButton_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_excluirActionPerformed
        try {
            int id = Integer.parseInt(txtID.getText().trim());

            GrupoVeiculo gv = new GrupoVeiculo();
            gv.setId(id);

            gv.deleteGrupoVeiculo(gv);

            JOptionPane.showMessageDialog(null,
                    "Grupo de veículo excluído com sucesso!",
                    "SUCESSO",
                    JOptionPane.INFORMATION_MESSAGE);
            limpaCampos();
            listarTabela();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Informe um ID numérico válido para excluir!",
                    "ERRO DE DIGITAÇÃO",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage(),
                    "ERRO NO BANCO",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_excluirActionPerformed

    private void jButton_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_listarActionPerformed
        listarTabela();
    }//GEN-LAST:event_jButton_listarActionPerformed

    private void jButton_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salvarActionPerformed
        try {
            String tipo = txtTipo.getText().trim();
            double precoDiaria = Double.parseDouble(txtPrecoDiaria.getText().trim().replace(",", "."));

            if (tipo.isEmpty() || tipo.length() > 50) {
                JOptionPane.showMessageDialog(null,
                        "O Tipo deve ter entre 1 e 50 caracteres!",
                        "AVISO",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (precoDiaria <= 0) {
                JOptionPane.showMessageDialog(null,
                        "O Preço Diária deve ser maior que zero!",
                        "AVISO",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            GrupoVeiculo gv = new GrupoVeiculo();
            gv.setTipo(tipo);
            gv.setPrecoDiaria(precoDiaria);

            gv.insertGrupoVeiculo(gv);

            JOptionPane.showMessageDialog(null,
                    "Grupo de veículo cadastrado com sucesso!",
                    "SUCESSO",
                    JOptionPane.INFORMATION_MESSAGE);
            limpaCampos();
            listarTabela();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Digite um valor numérico válido no campo Preço Diária!",
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
            GrupoVeiculo gv = new GrupoVeiculo();
            List<GrupoVeiculo> lista = gv.findAllGrupoVeiculo();
            DefaultTableModel model = (DefaultTableModel) tblGrupoVeiculo.getModel();
            model.setRowCount(0);
            for (GrupoVeiculo grupo : lista) {
                Object[] linha = new Object[3];
                linha[0] = grupo.getId();
                linha[1] = grupo.getTipo();
                linha[2] = grupo.getPrecoDiaria();
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
        txtID.setText("");
        txtTipo.setText("");
        txtPrecoDiaria.setText("");
        txtTipo.requestFocus();
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
            java.util.logging.Logger.getLogger(tela_GrupoVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_GrupoVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_GrupoVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_GrupoVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_GrupoVeiculo().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jsubtitulo;
    private javax.swing.JLabel jtitulo_cadastro;
    private javax.swing.JLabel jtitulo_id;
    private javax.swing.JLabel jtitulo_preco;
    private javax.swing.JLabel jtitulo_tipo;
    private javax.swing.JTable tblGrupoVeiculo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPrecoDiaria;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}