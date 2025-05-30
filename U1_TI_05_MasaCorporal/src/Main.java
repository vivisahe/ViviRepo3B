import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception{
        Persona persona =  new Persona();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masa corporal");
        System.out.println("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingresa tu altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Ingresa tu peso: ");
        double peso = scanner.nextDouble();

        persona.setAltura(altura);
        persona.setNombre(nombre);
        persona.setPeso(peso);

        double imc = persona.calcularIMC();
        System.out.println("Tu imc es: "+persona.clasificar(imc));
    }
}