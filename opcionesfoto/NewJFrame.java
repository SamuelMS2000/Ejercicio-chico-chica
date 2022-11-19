package opcionesfoto;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


/**
 * @author SamuelMS
 */
public class NewJFrame extends javax.swing.JFrame {
        public static void main(String args[]){   
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
              }
        });
    } 
    StringBuffer opciones;

    public NewJFrame() {
        initComponents();
        opciones = new StringBuffer("A--");
        jLabel1.setText("");
        opcionElegida();
    }

    private void cambiarOpciones(int index, char c) {
        opciones.setCharAt(index, c);
        opcionElegida();
    }

    private void opcionElegida() {
        String ruta = "src/main/java/dibujos/" + opciones + ".PNG";
        
        ImageIcon icon = new ImageIcon(ruta);
        jLabel1.setIcon(icon);
        
        if (icon == null) {
            jLabel1.setText("error");
        } else {
            jLabel1.setText("");
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoGenero = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        bChico = new javax.swing.JRadioButton();
        bChica = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        bFondo = new javax.swing.JCheckBox();
        bPeinado = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setPreferredSize(new java.awt.Dimension(1295, 910));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grupoGenero.add(bChico);
        bChico.setText("CHICO");
        bChico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bChicoActionPerformed(evt);
            }
        });
        jPanel1.add(bChico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));
        bChico.getAccessibleContext().setAccessibleName("chico");

        grupoGenero.add(bChica);
        bChica.setSelected(true);
        bChica.setText("CHICA");
        bChica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bChicaActionPerformed(evt);
            }
        });
        jPanel1.add(bChica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 2, 90, 370));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bFondo.setText("FONDO");
        bFondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFondoActionPerformed(evt);
            }
        });
        jPanel2.add(bFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        bPeinado.setText("PEINADO");
        bPeinado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPeinadoActionPerformed(evt);
            }
        });
        jPanel2.add(bPeinado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 90, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bChicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bChicoActionPerformed
    cambiarOpciones (0, 'O');    // TODO add your handling code here:
    }//GEN-LAST:event_bChicoActionPerformed

    private void bChicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bChicaActionPerformed
    cambiarOpciones (0, 'A');    // TODO add your handling code here:
    }//GEN-LAST:event_bChicaActionPerformed

    private void bFondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFondoActionPerformed
     char c = '-';
        if (bFondo.isSelected()) {
            c = 'f';
        }
        cambiarOpciones(1, c);    // TODO add your handling code here:
    }//GEN-LAST:event_bFondoActionPerformed

    private void bPeinadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPeinadoActionPerformed
     char c = '-';
        if (bPeinado.isSelected()) {
            c = 'p';
        }
        cambiarOpciones(2, c);    // TODO add your handling code here:
    }//GEN-LAST:event_bPeinadoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bChica;
    private javax.swing.JRadioButton bChico;
    private javax.swing.JCheckBox bFondo;
    private javax.swing.JCheckBox bPeinado;
    private javax.swing.ButtonGroup grupoGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
