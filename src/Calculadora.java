import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame {

    private JPanel rootPanel;
    private JButton botonSuma;
    private JButton botonResta;
    private JButton botonMultiplicacion;
    private JButton botonDivision;
    private JButton botonCuadrado;
    private JTextField primerNumeroTextField;
    private JTextField segundoNumeroTextField;
    private JTextField resultadoTextField;
    private JLabel resultadoTexto;
    private JLabel calculadoraJLabel;

    public Calculadora(){

        //Añadimos este comando para que utilice el .form
        add(rootPanel);
        //Título y tamaño
        setTitle("Victor Martin Gil - M07_PAC_UF1");
        setSize(430,300);
        //Acción al cerrar nuestro programa
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        calculadoraJLabel.setForeground(Color.BLUE);
        calculadoraJLabel.setFont(new Font("Calibri",Font.BOLD, 16));

        //ACCIONES DE LOS BOTONES
        botonSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a,b;
                a = Integer.parseInt(primerNumeroTextField.getText());
                b = Integer.parseInt(segundoNumeroTextField.getText());
                int resultado = a+b;
                resultadoTextField.setText(String.valueOf(resultado));

            }
        });

        botonResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a,b;
                a = Integer.parseInt(primerNumeroTextField.getText());
                b = Integer.parseInt(segundoNumeroTextField.getText());
                int resultado = a-b;
                resultadoTextField.setText(String.valueOf(resultado));

            }
        });

        botonMultiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a,b;
                a = Integer.parseInt(primerNumeroTextField.getText());
                b = Integer.parseInt(segundoNumeroTextField.getText());
                int resultado = a*b;
                resultadoTextField.setText(String.valueOf(resultado));

            }
        });

        botonDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a,b;
                a = Double.parseDouble(primerNumeroTextField.getText());
                b = Double.parseDouble(segundoNumeroTextField.getText());
                double resultado = a/b;
                resultadoTextField.setText(String.valueOf(resultado));

            }
        });

        botonCuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a,b;
                a = Integer.parseInt(primerNumeroTextField.getText());
                int resultado = a*a;
                resultadoTextField.setText(String.valueOf(resultado));

            }
        });
    }
}
