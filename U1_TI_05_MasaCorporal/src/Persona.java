public class Persona {
    private String nombre;
    private double altura;
    private double peso;
    private String clasificar;

    public double calcularIMC(){
        double imc;
        imc = peso/(altura*altura);
        return imc;
    }
    public String clasificar(double imc){
        String clas="";
        if(imc>=30.0){
            clas="Obesidad";
        }
        else if(imc>=25.0 && imc<29.9){
            clas="Sobrepeso";
        }else if(imc>=18.5 && imc<24.9){
            clas="Peso Normal";
        }else if(imc<18.5){
            clas="Bajo de peso";
        }
        return clas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
