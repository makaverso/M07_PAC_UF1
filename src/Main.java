import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main (String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {

        //Aspecto botones diferente al brillante de Java
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        //Lanzamos nuestra calculadora
        //EvenQueue.invokeLater(new Runnable(){
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                try{
                    Calculadora cal = new Calculadora();
                    //Centramos el programa en nuestra pantalla
                    cal.setLocationRelativeTo(null);
                    //Hacemos visible nuestro programa
                    cal.setVisible(true);

                } catch (Exception e){
                    e.printStackTrace();
                }

            }
        });



    }
}
