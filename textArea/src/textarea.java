import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class textarea extends javax.swing.JFrame {
    JLabel rotulo1, rotulo2, rotulo3, erro;
    JButton listar;
    JTextField nome, idade, hora;
    JTextArea texto;

    public textarea() {
        super("Lista de Pessoas");
        Container tela = getContentPane();
        setLayout(null);
        nome = new JTextField(15);
        idade = new JTextField(15);
        hora = new JTextField(15);
        rotulo1 = new JLabel ("Nome Completo");
        rotulo2 = new JLabel ("Idade");
        rotulo3 = new JLabel ("Horário de Chegada");
        erro = new JLabel ("NADA FOI DIGITADO");
        listar = new JButton ("LISTAR");
        texto = new JTextArea();
        
        nome.setBounds(30,30,200,20);
        idade.setBounds(30,80,200,20);
        hora.setBounds(30,130,200,20);
        rotulo1.setBounds(10,10,200,20);
        rotulo2.setBounds(10,60,200,20);
        rotulo3.setBounds(10,110,200,20);
        listar.setBounds(70,180,100,20);
        texto.setBounds(260,10,300,230);
        
        tela.add(listar);
        tela.add(nome);
        tela.add(idade);
        tela.add(hora);
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(texto);
       
        listar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
            String pegarNome;
            int pegarIdade, pegarHora;
            pegarNome = (nome.getText());
            pegarIdade = Integer.parseInt(idade.getText());
            pegarHora = Integer.parseInt(hora.getText());
            
            if((pegarNome == null)&&(pegarIdade == null )){
            texto.setText(erro.getText());
            texto.setForeground(Color.red);
            }else{
            
            String saida = "Nome Completo: " +pegarNome+ "\n" + "\n Idade: " +pegarIdade+ "\n" + "\n Horário de Chegada" +pegarHora+ "\n";
            texto.setText(saida);
            texto.setForeground(Color.black);
            }
            
            }});
        
        
        
        
        initComponents();
        setSize(600,300);
        setLocationRelativeTo(null);
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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new textarea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
