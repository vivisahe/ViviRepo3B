import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) throws Exception {
        Usuario usuario = new Usuario();
        System.out.println("Inicio de sesion");
        String NombreUsuario = JOptionPane.showInputDialog("Ingresa nombre:");
        String Password =JOptionPane.showInputDialog("Ingresa contraseña:");

    }
}