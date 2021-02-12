import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
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
 Font f = new Font("Monospaced", BOLD, 17);
 Font g = new Font("Agency FB", BOLD + ITALIC, 15);
 Font h = new Font("Times New Roman", BOLD, 14);

 public primerpanel(){
     super("Esto es el generador de contraseñas");
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     this.setResizable(false);

     setLayout(new GridLayout(3,1));
     JPanel general= new JPanel();
     general.setBackground(new Color(247, 218, 163));
     JPanel primero= new JPanel();
     primero.setBackground(new Color(247, 218, 163));
     JPanel texto = new JPanel();
     texto.setBackground(new Color(247, 218, 163));
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
     h1.setForeground(new Color(140, 24, 82));
     primero.setLayout(new GridLayout(3,1));
     primero.add(textcontra);
     primero.add(texto);
     //p2.add(copiar);
     primero.add(h1);
     copiar.addActionListener(new Listenercopiar1());


     JPanel segundo = new JPanel();
     segundo.setBackground(new Color(247, 218, 163));
     segundo.setLayout(new GridLayout(1,2,20,20));
     JPanel segundo2 =new JPanel();
     segundo2.setBackground(new Color(247, 218, 163));
     segundo2.setLayout(new GridLayout(3,1));
     JLabel vacio1=new JLabel("");
     vacio1.setBackground(new Color(247, 218, 163));
     segundo2.add(vacio1);
     JPanel spinn=new JPanel();
     spinn.setBackground(new Color(247, 218, 163));
        spinner = new JSpinner(spin);
        spinner.setPreferredSize(new Dimension(100,30));
        spinn.add(spinner);
        segundo2.add(spinn);
        JLabel vacio2= new JLabel("");
     vacio2.setBackground(new Color(247, 218, 163));
        segundo2.add(vacio2);
        JPanel lista = new JPanel();
     lista.setBackground(new Color(247, 218, 163));

     minuscula=new JCheckBox("Minuscula");
     minuscula.setFont(g);
     minuscula.setBackground(new Color(247, 218, 163));
     mayuscula=new JCheckBox("Mayuscula");
     mayuscula.setFont(g);
     mayuscula.setBackground(new Color(247, 218, 163));
     numeros = new JCheckBox("Numeros");
     numeros.setFont(g);
     numeros.setBackground(new Color(247, 218, 163));
     simbolos=new JCheckBox("Simbolos");
     simbolos.setFont(g);
     simbolos.setBackground(new Color(247, 218, 163));
     lista.setLayout(new GridLayout(4,1));
     lista.add(minuscula);
     lista.add(mayuscula);
     lista.add(numeros);
     lista.add(simbolos);

     segundo.add(segundo2);
     segundo.add(lista);

     JPanel tercero = new JPanel();
     tercero.setBackground(new Color(247, 218, 163));
     tercero.setLayout(new GridLayout(3,1));

     JPanel barrap = new JPanel();
     barrap.setBackground(new Color(247, 218, 163));
     barra= new JProgressBar();
     barra.getValue();
     barrap.add(barra);
     barra.addChangeListener(new hola() );
     JPanel botones = new JPanel();
     botones.setBackground(new Color(247, 218, 163));
     botones.setLayout(new GridLayout(1,2,30,30));
    // JLabel vacio3= new JLabel("");
    // botones.add(vacio3);

        JPanel cancelarb = new JPanel();
     cancelarb.setBackground(new Color(247, 218, 163));
     cancelar=new JButton("Cancelar");
     cancelar.setBackground(new Color(232, 91, 74));
     cancelar.setFont(h);
     cancelarb.add(cancelar);
     botones.add(cancelarb);

     JPanel generarb = new JPanel();
     generarb.setBackground(new Color(247, 218, 163));
     generar=new JButton("Generar");
     generar.setBackground(new Color(64, 199, 102));
     generar.setFont(h);

     //generar.setSize(60,60);

     generarb.add(generar);
     botones.add(generarb);
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
            /*try {
                FileWriter documento = new FileWriter  ("C:\\Users\\carma\\IdeaProjects\\entregable5\\Generadorcontraseñas\\src\\contraseñas", true);
                PrintWriter pw = new PrintWriter (documento);
                pw.println(contraseña[resultado]);
                pw.close();
            } catch (Exception e) {
                // TODO: handle exception
            }


        }*/

        }
    }

    private class Listenercopiar2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

           System.exit(0);
        }
    }



    private class Listenercopiar3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int cantidad= (int)spin.getValue();
            if (seguridad.esFuerte(cantidad)==true) {
                barra.setBackground(Color.green);
                barra.setString("contraseña buena");
                barra.add(new JLabel("contraseña buena"),BorderLayout.CENTER);
            }else {
                barra.setBackground(Color.red);
            }
        }
    }

    private class hola implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {
            int cantidad= (int)spin.getValue();
           if (seguridad.esFuerte(cantidad)==true) {
               barra.setBackground(Color.green);
           }else {
               barra.setBackground(Color.red);
           }
           }
        }
    }

