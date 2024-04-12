import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P1MenuColoresFrame {

            public static void main(String[] args) {
                JFrame ventana = new JFrame("Panel menú Colores");
                ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JPanel panel = new JPanel();
                panel.setLayout(new BorderLayout());
                ventana.add(panel);
                ventana.setSize(300,300);


                JMenuBar barraMenu = new JMenuBar();
                JMenu menuColores = new JMenu("Colores");
                barraMenu.add(menuColores);

                JMenuItem rojo = new JMenuItem("Rojo");
                rojo.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panel.setBackground(java.awt.Color.RED);
                    }
                });
                menuColores.add(rojo);

                JMenuItem verde = new JMenuItem("Verde");
                verde.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panel.setBackground(java.awt.Color.GREEN);
                    }
                });
                menuColores.add(verde);

                JMenuItem azul = new JMenuItem("Azul");
                azul.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panel.setBackground(java.awt.Color.BLUE);
                    }
                });
                menuColores.add(azul);

                menuColores.addSeparator();

                JMenuItem salir = new JMenuItem("Exit");
                salir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                });


                menuColores.add(salir);

                ventana.setJMenuBar(barraMenu);


                ventana.pack();
                ventana.setVisible(true);
            }
        }




