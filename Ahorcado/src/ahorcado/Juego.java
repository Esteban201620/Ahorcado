/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

/**
 *
 * @author Estudiantes
 */
public class Juego extends javax.swing.JFrame {

    Jugador miJugador= new Jugador();
    int Turno = 8;
    String Palabra="";
    char LetrasDePalabra[];
    int numeroDeLetras=0;
    char Letra='a';
    char LetrasDePalabraImprimir[];
    
    /**
     * Creates new form Juego
     */
    public Juego() {
        //ingresarPalabra();
        initComponents();
    }
    void ingresarLetra(){
        Letra = miJugador.letra;
    }

    void ingresarPalabra() {
        Turno=8;
        PalabraGrafica.setEnabled(true);
        IngresarPalabra.setEnabled(true);
        LetrasDePalabra = Palabra.toCharArray();
        numeroDeLetras = LetrasDePalabra.length;
        for (int j = 0; j < numeroDeLetras; j++) {
            LetrasDePalabraImprimir[j] = '$';
        }

    }

    int verificarLetra() {
        for (int i = 0; i < numeroDeLetras; i++) {
            if (LetrasDePalabra[i] == Letra && Turno > 0) {
                LetrasDePalabraImprimir[i] = Letra;
                return 0;
            } else {
                if (LetrasDePalabra[i] != Letra && Turno > 0) {
                    Turno -= 1;
                    return 1;
                }
            }
        }
        
        return 3;
    }

    void imprimirLetra() {
        switch (this.verificarLetra()) {
            case 0:
                imprimir.setText(LetrasDePalabraImprimir.toString());
                LetraIngresada.setText("");
                break;
            case 1:
                LetraIngresada.setText("");
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PalabraGrafica = new javax.swing.JTextField();
        LetraIngresada = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        IngresarPalabra = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        imprimir = new javax.swing.JLabel();
        IngresarLetra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PalabraGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PalabraGraficaActionPerformed(evt);
            }
        });

        LetraIngresada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LetraIngresadaActionPerformed(evt);
            }
        });

        jLabel1.setText("Palabra en juego:");

        jLabel2.setText("Ingrese una letra:");

        IngresarPalabra.setText("OK");
        IngresarPalabra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngresarPalabraMouseClicked(evt);
            }
        });

        imprimir.setText("jLabel4");

        IngresarLetra.setText("Agregar");
        IngresarLetra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngresarLetraMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(175, 175, 175))
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LetraIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(IngresarLetra))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PalabraGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(IngresarPalabra))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(imprimir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PalabraGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IngresarPalabra))
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LetraIngresada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IngresarLetra))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imprimir)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PalabraGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PalabraGraficaActionPerformed

    }//GEN-LAST:event_PalabraGraficaActionPerformed

    private void LetraIngresadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LetraIngresadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LetraIngresadaActionPerformed

    private void IngresarPalabraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarPalabraMouseClicked
        Palabra = PalabraGrafica.getText();
        ingresarPalabra();
        PalabraGrafica.setText("");
        PalabraGrafica.setEnabled(false);
        IngresarPalabra.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresarPalabraMouseClicked

    private void IngresarLetraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarLetraMouseClicked
        this.miJugador.letra = IngresarLetra.getText().charAt(0);
        verificarLetra();
        imprimirLetra();
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresarLetraMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IngresarLetra;
    private javax.swing.JButton IngresarPalabra;
    private javax.swing.JTextField LetraIngresada;
    private javax.swing.JTextField PalabraGrafica;
    private javax.swing.JLabel imprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
