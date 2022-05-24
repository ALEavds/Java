import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
public class calculadora extends javax.swing.JFrame {
        JButton somar, subtrair;
        JTextField texto, texto2, texto3;
        int num1, num2, resultado=0;

    public calculadora() {
        super("CALCULADORA");
        initComponents();
        Container tela = getContentPane();
        setLayout(null);
        texto = new JTextField(15);
texto2 = new JTextField(15);
texto3 = new JTextField(15);
somar = new JButton(" SOMAR ");
subtrair = new JButton(" SUBTRAIR ");

texto.setBounds(120,20,200,20);
texto2.setBounds(120,40,200,20);
texto3.setBounds(120,130,200,20);
//BOTOES DE ACOES
somar.setBounds(200,80,100,20);
subtrair.setBounds(200,100,100,20);

tela.add(somar);
tela.add(subtrair);
tela.add(texto);
tela.add(texto2);
tela.add(texto3);

somar.addActionListener( new ActionListener(){

public void actionPerformed(ActionEvent event){
num1 = Integer.parseInt(texto.getText());
num2 = Integer.parseInt(texto2.getText());
resultado = num1 + num2;
String resul = String.valueOf(resultado);

texto3.setText(Integer.toString(resultado));
}
});


subtrair.addActionListener( new ActionListener(){

public void actionPerformed(ActionEvent event){
num1 = Integer.parseInt(texto.getText());
num2 = Integer.parseInt(texto2.getText());
resultado = num1 - num2;
String resul = String.valueOf(resultado);

texto3.setText(Integer.toString(resultado));
}
});


setSize(400,250);
setVisible(true);
texto.requestFocus();
}
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
