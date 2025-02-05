import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeScreen {
    private JPanel panel1;
    private JTextField usernameController;
    private JPasswordField passwordController;
    public JButton iniciarSesionButton;
    private JLabel mensajeController;


    public HomeScreen() {
        iniciarSesionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(usernameController.getText());
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("HomeScreen");
        frame.setContentPane(new HomeScreen().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }




    static void iniciarsesion(){
        System.out.println("Hola");
    }






}
