import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.PrintWriter;

import static java.awt.Font.*;

public class primerpanel extends JFrame {

 private JTextField textcontra;
 private JButton copiar;
 private JLabel h1;
 private JSpinner spinner;
 private JCheckBox minuscula,mayuscula,numeros,simbolos;
 private SpinnerModel spin= new SpinnerNumberModel(1,1,20,1);
 private JProgressBar barra;
 private JButton generar;
 private JButton cancelar;
 Font f = new Font("Agency FB", BOLD, 20);
 Font g = new Font("Thaoma", BOLD + ITALIC, 15);
 Font h = new Font("Times New Roman", BOLD, 14);

 public primerpanel(){
     super("Esto es el generador de contraseñas");
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     setLayout(new GridLayout(3,1));
     JPanel general= new JPanel();
     JPanel primero= new JPanel();

     JPanel texto = new JPanel();
     texto.setLayout(new FlowLayout());
     textcontra= new JTextField("");
     textcontra.setBackground(new Color(252, 240, 131));
     copiar=new JButton("Copiar");
     copiar.setBackground(new Color(122, 222, 255));
     copiar.setBounds(new Rectangle(20,20,50,20));
     copiar.setSize(30,30);
     copiar.setFont(h);
     texto.add(copiar);
     h1 = new JLabel("Personalice la contraseña requerida");
     h1.setFont(f);
     primero.setLayout(new GridLayout(3,1));
     primero.add(textcontra);
     primero.add(texto);
     //p2.add(copiar);
     primero.add(h1);
     copiar.addActionListener(new Listenercopiar1());


     JPanel segundo = new JPanel();
     segundo.setLayout(new GridLayout(1,2,20,20));
     JPanel segundo2 =new JPanel();
     segundo2.setLayout(new GridLayout(3,1));
     JLabel vacio1=new JLabel("");
     segundo2.add(vacio1);
     JPanel spinn=new JPanel();
        spinner = new JSpinner(spin);
        spinner.setPreferredSize(new Dimension(100,30));
        spinn.add(spinner);
        segundo2.add(spinn);
        JLabel vacio2= new JLabel("");
        segundo2.add(vacio2);
        JPanel lista = new JPanel();

     minuscula=new JCheckBox("Minuscula");
     minuscula.setFont(g);
     mayuscula=new JCheckBox("Mayuscula");
     mayuscula.setFont(g);
     numeros = new JCheckBox("Numeros");
     numeros.setFont(g);
     simbolos=new JCheckBox("Simbolos");
     simbolos.setFont(g);
     lista.setLayout(new GridLayout(4,1));
     lista.add(minuscula);
     lista.add(mayuscula);
     lista.add(numeros);
     lista.add(simbolos);

     segundo.add(segundo2);
     segundo.add(lista);

     JPanel tercero = new JPanel();
     tercero.setLayout(new GridLayout(3,1));

     JPanel barrap = new JPanel();
     barra= new JProgressBar();
     barra.getValue();
     barrap.add(barra);
     JPanel botones = new JPanel();
     botones.setLayout(new GridLayout(1,3,30,30));
     JLabel vacio3= new JLabel("");
     botones.add(vacio3);


     cancelar=new JButton("Cancelar");
     cancelar.setBackground(new Color(232, 91, 74));
     cancelar.setFont(h);
     botones.add(cancelar);
     generar=new JButton("Generar");
     generar.setBackground(new Color(64, 199, 102));
     general.setFont(h);
     //generar.setSize(60,60);
     botones.add(generar);
     tercero.add(barrap);
     tercero.add(botones);
     cancelar.addActionListener(new Listenercopiar2());
     generar.addActionListener(new Listenercopiar3());



     general.add(tercero);
     general.add(segundo);
     general.add(primero);

     add(general,BorderLayout.NORTH);
     add (segundo,BorderLayout.CENTER);
     add(tercero,BorderLayout.SOUTH);
     setSize(400,400);
     setVisible(true);
 }

    private String getSansSerif() {
        return SANS_SERIF;
    }

    public static void main(String[] args) {
        primerpanel pp = new primerpanel();
    }
    private class Listenercopiar1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                FileWriter documento = new FileWriter  ("C:\\Users\\carma\\IdeaProjects\\entregable5\\Generadorcontraseñas\\src\\contraseñas", true);
                PrintWriter pw = new PrintWriter (documento);
                pw.println(contraseña[resultado]);
                pw.close();
            } catch (Exception e) {
                // TODO: handle exception
            }


        }

        }
    }

    private class Listenercopiar2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    private class Listenercopiar3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
