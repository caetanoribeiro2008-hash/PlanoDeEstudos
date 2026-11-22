
package visao;

import controlador.ControladorTelas;
import java.util.ArrayList;
import modelo.Conteudo;
import javax.swing.*;
import java.awt.*;
import modelo.ConteudoPrioridade;


public class TelaPrioridades extends javax.swing.JPanel {

    private ControladorTelas controlador;
    private ArrayList<Conteudo> conteudosEscolhidos;
    private ArrayList<JComboBox<String>> camposPrioridade = new ArrayList<>();
    
    private void criarCamposPrioridade() {

    camposPrioridade.clear();

    jPanelPrioridades.setLayout(new BoxLayout(
            jPanelPrioridades, BoxLayout.Y_AXIS
    ));

    for (Conteudo conteudo : conteudosEscolhidos) {

        JPanel linha = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JLabel nome = new JLabel(
                conteudo.getMateria() + " - " + conteudo.getNome()
        );

        JComboBox<String> prioridade = new JComboBox<>(
                new String[]{
                    "1 - Alta",
                    "2 - Média",
                    "3 - Baixa"
                }
        );

        linha.setBackground(java.awt.Color.WHITE);
        nome.setFont(new java.awt.Font("SansSerif", 0, 14));
        prioridade.setFont(new java.awt.Font("SansSerif", 0, 14));
        linha.add(nome);
        linha.add(prioridade);

        jPanelPrioridades.add(linha);

        // Mantém um campo para cada linha, na mesma ordem dos conteúdos.
        camposPrioridade.add(prioridade);
    }

    jPanelPrioridades.revalidate();
    jPanelPrioridades.repaint();
}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelPrioridades = new javax.swing.JPanel();
        jButtonVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setOpaque(false);
        jPanel1.setBackground(new java.awt.Color(236, 244, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jDesktopPane1.setOpaque(false);
        jDesktopPane1.setBackground(new java.awt.Color(236, 244, 255));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(43, 17, 253));

        jPanel2.setBackground(new java.awt.Color(236, 244, 255));
        jPanel2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 23)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Suas prioridades!");

        jButton1.setBackground(new java.awt.Color(43, 17, 253));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Continuar");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jPanelPrioridades.setBackground(new java.awt.Color(0, 204, 204));
        jPanelPrioridades.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelPrioridades.setForeground(new java.awt.Color(0, 153, 153));
        jPanelPrioridades.setAutoscrolls(true);

        javax.swing.GroupLayout jPanelPrioridadesLayout = new javax.swing.GroupLayout(jPanelPrioridades);
        jPanelPrioridades.setLayout(jPanelPrioridadesLayout);
        jPanelPrioridadesLayout.setHorizontalGroup(
            jPanelPrioridadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 631, Short.MAX_VALUE)
        );
        jPanelPrioridadesLayout.setVerticalGroup(
            jPanelPrioridadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanelPrioridades);

        jButtonVoltar.setBackground(new java.awt.Color(71, 255, 156));
        jButtonVoltar.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jButtonVoltar.setForeground(new java.awt.Color(28, 31, 72));
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.setFocusPainted(false);
        jButtonVoltar.addActionListener(this::jButtonVoltarActionPerformed);

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("escolha suas prioridade de maneira mais organizada para seu dia!!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonVoltar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(221, 221, 221)
                                .addComponent(jLabel1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGap(0, 196, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltar)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArrayList<ConteudoPrioridade> listaPrioridades = new ArrayList<>();

        for (int i = 0; i < conteudosEscolhidos.size(); i++) {

        Conteudo conteudo = conteudosEscolhidos.get(i);

        JComboBox<String> campo = camposPrioridade.get(i);

        int prioridade = campo.getSelectedIndex() + 1;

        listaPrioridades.add(
            new ConteudoPrioridade(conteudo, prioridade)
        );
    }

    controlador.carregarTelaDisponibilidade(listaPrioridades);
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
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelPrioridades;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
public TelaPrioridades(ControladorTelas controlador,
                       ArrayList<Conteudo> conteudosEscolhidos) {

    initComponents();

    this.controlador = controlador;
    this.conteudosEscolhidos = conteudosEscolhidos;
    
    criarCamposPrioridade();
}
}
