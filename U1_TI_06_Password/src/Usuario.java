import javax.swing.JOptionPane;
public class Usuario {
    private String NombreUsuario;
    private String contrasenia;

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public String getContrasenia(String contrasenia) {
        return contrasenia;
    }

    public void setNombreUsuario(String NombreUsuario) {
        if (NombreUsuario == null || NombreUsuario.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El usuario no puede ser nulo ni estar vacio");
        } else {
            this.NombreUsuario = NombreUsuario;
        }

    }

    public void setcontrasenia(String contrasenia) {
        boolean mayusculas = false;
        boolean minusculas = false;
        if (contrasenia == null || contrasenia.length() < 8) {
            if (Character.isUpperCase(Integer.parseInt(contrasenia)) || Character.isLowerCase(contrasenia.charAt(0))) {
                mayusculas = true;
                minusculas = true;
            } else {
                contrasenia = JOptionPane.showInputDialog("Ingrese una contraseña valida");
            }
            contrasenia = JOptionPane.showInputDialog("La contraseña debe tener al menos 8 caracteres");
        } else {
            this.contrasenia = contrasenia;
        }

    }

    public boolean autenticar(boolean mayuscula, boolean minuscula) {
        if (mayuscula == true || minuscula == true) {
            JOptionPane.showMessageDialog(null, "Acceso exitoso");
        } else {
            JOptionPane.showMessageDialog(null, "Acceso denegado");
        }
    }
}
