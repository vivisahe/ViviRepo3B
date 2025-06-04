import javax.swing.JOptionPane;
public class Usuario {
    private String NombreUsuario;
    private String password;

    public String getNombreUsuario() {
        return NombreUsuario;
    }
    public String getpassword(String password){
        return password;
    }
    public void setNombreUsuario(String NombreUsuario){
         if (NombreUsuario == null || NombreUsuario.isEmpty()){
             JOptionPane.showMessageDialog(null,"El usuario no puede ser nulo ni estar vacio");
         }
         else{
             this.NombreUsuario = NombreUsuario;
         }

        public void setpassword(String password){
             if( password == null || password.length()<8){
                 JOptionPane.showMessageDialog(null,"La contraseña debe tener al menos 8 caracteres!!");
                 return;
             }
             for (int i=0; i<password.length(); i++){
                 System.out.print(password.charAt(i));
             }

         }

     }
}
