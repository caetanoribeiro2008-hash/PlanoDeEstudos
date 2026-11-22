
package visao;

import controlador.ControladorMaterias;
import controlador.ControladorTelas;
import javax.swing.JDesktopPane;
import modelo.Materia;


public class TelaMaterias extends javax.swing.JPanel {

   
    public TelaMaterias() {
        initComponents();
        inicio();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jButtonNext1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBoxMatematica = new javax.swing.JCheckBox();
        jCheckBoxGeografia = new javax.swing.JCheckBox();
        jCheckBoxPortugues = new javax.swing.JCheckBox();
        jCheckBoxHistoria = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jCheckBoxLiteratura = new javax.swing.JCheckBox();
        jCheckBoxFisica = new javax.swing.JCheckBox();
        jCheckBoxQuimica = new javax.swing.JCheckBox();
        jCheckBoxBiologia = new javax.swing.JCheckBox();
        jButtonVoltar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        jButtonNext1.setText("NEXT");
        jButtonNext1.addActionListener(this::jButtonNext1ActionPerformed);

        jPanel2.setOpaque(false);
        jPanel2.setBackground(new java.awt.Color(236, 244, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 263, Short.MAX_VALUE)
        );

        jPanel1.setOpaque(false);
        jPanel1.setBackground(new java.awt.Color(236, 244, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 23)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("quais materias tu tem dificuldade?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(43, 17, 253));

        jPanel3.setBackground(new java.awt.Color(236, 244, 255));
        jPanel3.setOpaque(false);

        jPanel4.setBackground(new java.awt.Color(236, 244, 255));
        jPanel4.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Microsoft Uighur", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("QUAIS MATERIAS VOCÊ TEM MAIS DIFICULDADE?");

        jCheckBoxMatematica.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        jCheckBoxMatematica.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxMatematica.setText("Matemática");
        jCheckBoxMatematica.addActionListener(this::jCheckBoxMatematicaActionPerformed);

        jCheckBoxGeografia.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        jCheckBoxGeografia.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxGeografia.setText("Geografia");

        jCheckBoxPortugues.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        jCheckBoxPortugues.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxPortugues.setText("Português");
        jCheckBoxPortugues.addActionListener(this::jCheckBoxPortuguesActionPerformed);

        jCheckBoxHistoria.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        jCheckBoxHistoria.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxHistoria.setText("História");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxMatematica)
                    .addComponent(jCheckBoxGeografia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxHistoria)
                    .addComponent(jCheckBoxPortugues))
                .addGap(139, 139, 139))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel2)
                .addContainerGap(190, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jCheckBoxMatematica)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jCheckBoxPortugues)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxGeografia)
                    .addComponent(jCheckBoxHistoria))
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(43, 17, 253));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Continuar");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jCheckBoxLiteratura.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        jCheckBoxLiteratura.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxLiteratura.setText("Literatura");

        jCheckBoxFisica.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        jCheckBoxFisica.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxFisica.setText("Física");
        jCheckBoxFisica.addActionListener(this::jCheckBoxFisicaActionPerformed);

        jCheckBoxQuimica.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        jCheckBoxQuimica.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxQuimica.setText("Química");

        jCheckBoxBiologia.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        jCheckBoxBiologia.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxBiologia.setText("Biologia");

        jButtonVoltar.setBackground(new java.awt.Color(71, 255, 156));
        jButtonVoltar.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jButtonVoltar.setForeground(new java.awt.Color(28, 31, 72));
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.setFocusPainted(false);
        jButtonVoltar.addActionListener(this::jButtonVoltarActionPerformed);

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ESCOLHA AS MATÉRIAS QUE TU TENS MAIS DIFICULDADE!!!");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(6, 6, 6)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxQuimica)
                            .addComponent(jCheckBoxLiteratura))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxFisica)
                            .addComponent(jCheckBoxBiologia))
                        .addGap(169, 169, 169))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxFisica)
                    .addComponent(jCheckBoxLiteratura))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxQuimica)
                    .addComponent(jCheckBoxBiologia))
                .addGap(50, 50, 50)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltar)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNext1ActionPerformed
    }//GEN-LAST:event_jButtonNext1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    materia.atualizarMaterias();

    if (!jCheckBoxMatematica.isSelected()
            && !jCheckBoxPortugues.isSelected()
            && !jCheckBoxFisica.isSelected()
            && !jCheckBoxBiologia.isSelected()
            && !jCheckBoxLiteratura.isSelected()
            && !jCheckBoxQuimica.isSelected()
            && !jCheckBoxHistoria.isSelected()
            && !jCheckBoxGeografia.isSelected()) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "Selecione pelo menos uma matéria!");
        return;
    }

    // Usa o estado atual dos próprios checkboxes para não perder matérias
    // selecionadas antes de avançar para a próxima tela.
    Materia materiasSelecionadas = new Materia();
    materiasSelecionadas.setMatematica(jCheckBoxMatematica.isSelected());
    materiasSelecionadas.setPortugues(jCheckBoxPortugues.isSelected());
    materiasSelecionadas.setFisica(jCheckBoxFisica.isSelected());
    materiasSelecionadas.setBiologia(jCheckBoxBiologia.isSelected());
    materiasSelecionadas.setLiteratura(jCheckBoxLiteratura.isSelected());
    materiasSelecionadas.setQuimica(jCheckBoxQuimica.isSelected());
    materiasSelecionadas.setHistoria(jCheckBoxHistoria.isSelected());
    materiasSelecionadas.setGeografia(jCheckBoxGeografia.isSelected());

    controlador.carregarTelaConteudos(materiasSelecionadas);
    }//GEN-LAST:event_jButton1ActionPerformed

 
    private void jCheckBoxMatematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMatematicaActionPerformed
    materia.matematicaTrue(jCheckBoxMatematica.isSelected());
    }//GEN-LAST:event_jCheckBoxMatematicaActionPerformed

    private void jCheckBoxPortuguesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPortuguesActionPerformed
    }//GEN-LAST:event_jCheckBoxPortuguesActionPerformed

    private void jCheckBoxFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFisicaActionPerformed
     
    }//GEN-LAST:event_jCheckBoxFisicaActionPerformed

    
    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        controlador.voltar();
    }


    
    private final java.awt.Image fundoAura = new javax.swing.ImageIcon(
            getClass().getResource("/visao/imagens/fundo_aura.png")).getImage();

    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        g.drawImage(fundoAura, 0, 0, getWidth(), getHeight(), this);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonNext1;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JCheckBox jCheckBoxBiologia;
    private javax.swing.JCheckBox jCheckBoxFisica;
    private javax.swing.JCheckBox jCheckBoxGeografia;
    private javax.swing.JCheckBox jCheckBoxHistoria;
    private javax.swing.JCheckBox jCheckBoxLiteratura;
    private javax.swing.JCheckBox jCheckBoxMatematica;
    private javax.swing.JCheckBox jCheckBoxPortugues;
    private javax.swing.JCheckBox jCheckBoxQuimica;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

ControladorTelas controlador;
public TelaMaterias(ControladorTelas controlador) {
    this.controlador = controlador;
    initComponents();
    inicio();

}

ControladorMaterias materia;
public void inicio(){
    materia = new ControladorMaterias(jCheckBoxMatematica, jCheckBoxPortugues, jCheckBoxFisica, jCheckBoxBiologia, jCheckBoxLiteratura, jCheckBoxQuimica, jCheckBoxHistoria, jCheckBoxGeografia);
}
    
}

   
