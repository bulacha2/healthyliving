package com.trabalhopac.healthyliving;

import javax.swing.JOptionPane;

//@author Carlos, Suellen, Vitor e Ícaro
public class Main extends javax.swing.JFrame {

    ArquivoUsuario arquivo = new ArquivoUsuario();

    //Creates new form Main
    public Main() {

	initComponents();

	//Pega o Escrever gravado no arquivo, e forma a mensagem de boas vindas
	BoasVindas.setText("Olá " + arquivo.Ler());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPai = new javax.swing.JTabbedPane();
        mtlayerpnlFerramentas = new javax.swing.JLayeredPane();
        btnIMC = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        mtlayerpnlNutricao = new javax.swing.JLayeredPane();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        BoasVindas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Healthy Living");

        btnIMC.setText("Calculadora de IMC");
        btnIMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIMCActionPerformed(evt);
            }
        });

        jButton2.setText("Controle de Calorias");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mtlayerpnlFerramentasLayout = new javax.swing.GroupLayout(mtlayerpnlFerramentas);
        mtlayerpnlFerramentas.setLayout(mtlayerpnlFerramentasLayout);
        mtlayerpnlFerramentasLayout.setHorizontalGroup(
            mtlayerpnlFerramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mtlayerpnlFerramentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(207, Short.MAX_VALUE))
        );
        mtlayerpnlFerramentasLayout.setVerticalGroup(
            mtlayerpnlFerramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mtlayerpnlFerramentasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mtlayerpnlFerramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIMC, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        mtlayerpnlFerramentas.setLayer(btnIMC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mtlayerpnlFerramentas.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        pnlPai.addTab("Ferramentas", mtlayerpnlFerramentas);

        jButton1.setText("Dieta");

        jButton3.setText("Opção 2");

        jButton4.setText("Opção 3");

        javax.swing.GroupLayout mtlayerpnlNutricaoLayout = new javax.swing.GroupLayout(mtlayerpnlNutricao);
        mtlayerpnlNutricao.setLayout(mtlayerpnlNutricaoLayout);
        mtlayerpnlNutricaoLayout.setHorizontalGroup(
            mtlayerpnlNutricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mtlayerpnlNutricaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        mtlayerpnlNutricaoLayout.setVerticalGroup(
            mtlayerpnlNutricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mtlayerpnlNutricaoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(mtlayerpnlNutricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        mtlayerpnlNutricao.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mtlayerpnlNutricao.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mtlayerpnlNutricao.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        pnlPai.addTab("Nutrição", mtlayerpnlNutricao);

        btnLogout.setText("Mudar Usuário");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLogout))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BoasVindas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair)))
                .addContainerGap())
            .addComponent(pnlPai)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlPai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(BoasVindas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed

	//Abre a mensagem de diálogo para fechar o programa
        int sair = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Saindo...", JOptionPane.YES_NO_OPTION);
        
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0); //Fecha o programa
        }

    }//GEN-LAST:event_btnSairActionPerformed

    private void btnIMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIMCActionPerformed

	//Torna a janela CalcIMC visível
	new CalcIMC().setVisible(true);

    }//GEN-LAST:event_btnIMCActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed

	arquivo.LogoutUser(); //Executa o método que faz logout do usuário
	new TelaLogin().setVisible(true); //Torna a janela TelaLogin visível
	dispose(); //Fecha a Janela atual

    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        new controledecalorias().setVisible(true); //Torna a janela controledecalorias visível
    }//GEN-LAST:event_jButton2MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel BoasVindas;
    private javax.swing.JButton btnIMC;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLayeredPane mtlayerpnlFerramentas;
    private javax.swing.JLayeredPane mtlayerpnlNutricao;
    private javax.swing.JTabbedPane pnlPai;
    // End of variables declaration//GEN-END:variables
}
