
package visao;
import controlador.ControladorTelas;
import java.util.ArrayList;
import modelo.Disponibilidade;
import javax.swing.JSpinner;
import modelo.ConteudoPrioridade;

/**
 *
 * @author caeta
 */
public class TelaDisponibilidade extends javax.swing.JPanel {

    private ArrayList<ConteudoPrioridade> listaPrioridades;
    private ControladorTelas controlador;
    
   public TelaDisponibilidade(
        ControladorTelas controlador,
        ArrayList<ConteudoPrioridade> listaPrioridades) {

    initComponents();

    this.controlador = controlador;
    this.listaPrioridades = listaPrioridades;

    configurarSpinners();
}

    private void configurarSpinners() {

        JSpinner[] spinners = {
            spSegunda, spTerca, spQuarta,
            spQuinta, spSexta, spSabado, spDomingo
        };

        for (JSpinner spinner : spinners) {
            spinner.setModel(
                new javax.swing.SpinnerNumberModel(0, 0, 8, 1)
            );
        }
    }

    private Disponibilidade obterDisponibilidade() {

        Disponibilidade disponibilidade = new Disponibilidade();

        disponibilidade.definirHoras("Segunda-feira",
                (int) spSegunda.getValue());

        disponibilidade.definirHoras("Terça-feira",
                (int) spTerca.getValue());

        disponibilidade.definirHoras("Quarta-feira",
                (int) spQuarta.getValue());

        disponibilidade.definirHoras("Quinta-feira",
                (int) spQuinta.getValue());

        disponibilidade.definirHoras("Sexta-feira",
                (int) spSexta.getValue());

        disponibilidade.definirHoras("Sábado",
                (int) spSabado.getValue());

        disponibilidade.definirHoras("Domingo",
                (int) spDomingo.getValue());

        return disponibilidade;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        spSegunda = new javax.swing.JSpinner();
        spTerca = new javax.swing.JSpinner();
        spQuarta = new javax.swing.JSpinner();
        spQuinta = new javax.swing.JSpinner();
        spSexta = new javax.swing.JSpinner();
        spSabado = new javax.swing.JSpinner();
        spDomingo = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButtonVoltar = new javax.swing.JButton();

        setBackground(new java.awt.Color(43, 17, 253));

        jPanel1.setBackground(new java.awt.Color(236, 244, 255));
        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 23)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Qual a sua disponibilidade em horas para cada dia?");

        jButton1.setBackground(new java.awt.Color(43, 17, 253));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Gerar plano");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(this::jButton1ActionPerformed);

        spSegunda.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        spSegunda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        spSegunda.setPreferredSize(new java.awt.Dimension(80, 28));

        spTerca.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        spTerca.setPreferredSize(new java.awt.Dimension(80, 28));

        spQuarta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        spQuarta.setPreferredSize(new java.awt.Dimension(80, 28));

        spQuinta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        spQuinta.setPreferredSize(new java.awt.Dimension(80, 28));

        spSexta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        spSexta.setPreferredSize(new java.awt.Dimension(80, 28));

        spSabado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        spSabado.setPreferredSize(new java.awt.Dimension(80, 28));

        spDomingo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        spDomingo.setPreferredSize(new java.awt.Dimension(80, 28));

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("segunda");

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("terça");

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("quarta");

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("quinta");

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("sexta");

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("sábado");

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("domingo");

        jButtonVoltar.setBackground(new java.awt.Color(71, 255, 156));
        jButtonVoltar.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jButtonVoltar.setForeground(new java.awt.Color(28, 31, 72));
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.setFocusPainted(false);
        jButtonVoltar.addActionListener(this::jButtonVoltarActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spTerca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spSegunda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spQuarta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spQuinta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spSabado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spDomingo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spSexta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(spSegunda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(spTerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spQuarta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spQuinta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spSexta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spSabado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Disponibilidade disponibilidade = obterDisponibilidade();

    if (disponibilidade.getTotalHoras() == 0) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "Informe pelo menos 1 hora de estudo!");
        return;
    }

    controlador.carregarTelaPlanoDeEstudos(
        listaPrioridades,
        disponibilidade
    );

    }//GEN-LAST:event_jButton1ActionPerformed


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
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner spDomingo;
    private javax.swing.JSpinner spQuarta;
    private javax.swing.JSpinner spQuinta;
    private javax.swing.JSpinner spSabado;
    private javax.swing.JSpinner spSegunda;
    private javax.swing.JSpinner spSexta;
    private javax.swing.JSpinner spTerca;
    // End of variables declaration//GEN-END:variables

}
