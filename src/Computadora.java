

public class Computadora {
    private String marca;
    private String modelo;
    private Boolean encendida=false;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Boolean getEncendida() {
        return encendida;
    }

    public void setEncendida(Boolean encendida) {
        this.encendida = true;
    }
    public void encender(){
        if(!encendida){
            encendida = true;
            System.out.println("Encendiendo...");
        }
    }
    public void apagar(){
        if(encendida){
            encendida = false;
            System.out.println("Apagando...");
        }
    }
}
