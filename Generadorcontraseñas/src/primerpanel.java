import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class primerpanel extends JFrame {

 private JTextField textcontra;
 private JButton copiar;
 private JLabel h1;
 private JSpinner spinner;
 private JCheckBox minuscula,mayuscula,numeros,simbolos;
 private SpinnerModel spin= new SpinnerNumberModel(1,1,20,1);

 public primerpanel(){
     super("Esto es el generador de contraseñas");
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     setLayout(new GridLayout(3,1));
     JPanel p1= new JPanel();
     JPanel p2= new JPanel();

    JPanel p3 = new JPanel();
    p3.setLayout(new FlowLayout());
     textcontra= new JTextField("");
     textcontra.setBackground(new Color(252, 240, 131));
     copiar=new JButton("Copiar");
     copiar.setBackground(new Color(220, 145, 230));
     copiar.setBounds(new Rectangle(20,20,50,20));
     copiar.setSize(30,30);
     p3.add(copiar);
     h1 = new JLabel("Personalice la contraseña requerida");
     p2.setLayout(new GridLayout(3,1));
     p2.add(textcontra);
     p2.add(p3);
     //p2.add(copiar);
     p2.add(h1);
     copiar.addActionListener(new Listenercopiar1());


     JPanel p4 = new JPanel();
     p4.setLayout(new GridLayout(1,2,20,20));
     JPanel p5 =new JPanel();
     p5.setLayout(new GridLayout(3,1));
     JLabel vacio1=new JLabel("");
     p5.add(vacio1);
     JPanel p7=new JPanel();
        spinner = new JSpinner(spin);
        spinner.setPreferredSize(new Dimension(100,30));
        p7.add(spinner);
        p5.add(p7);
        JLabel vacio2= new JLabel("");
        p5.add(vacio2);
    JPanel p6 = new JPanel();

        minuscula=new JCheckBox("Minuscula");
     mayuscula=new JCheckBox("Mayuscula");
     numeros = new JCheckBox("Numeros");
     simbolos=new JCheckBox("Simbolos");
     p6.setLayout(new GridLayout(4,1));
     p6.add(minuscula);
     p6.add(mayuscula);
     p6.add(numeros);
     p6.add(simbolos);

     p4.add(p5);
    p4.add(p6);


     p1.add(p4);
     p1.add(p2);

     add(p1,BorderLayout.NORTH);
     add (p4,BorderLayout.CENTER);
     setSize(400,400);
     setVisible(true);
 }

    public static void main(String[] args) {
        primerpanel pp = new primerpanel();
    }
    private class Listenercopiar1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
