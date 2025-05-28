

public class Main {
    public static void main(String[] args) throws Exception {
        Computadora computadora1 = new Computadora();
        computadora1.setModelo("MacBook Air");
        computadora1.setMarca("Apple");
        computadora1.encender();
        computadora1.encender();

        System.out.println("Modelo: "+computadora1.getModelo());
        System.out.println("Marca: "+computadora1.getMarca());
        computadora1.apagar();
    }
}