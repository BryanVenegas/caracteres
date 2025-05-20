import java.util.Scanner;
public class Ciclo {
private static final Scanner scanner = new Scanner(System.in);

public static int obtenerNumero() {
    System.out.print("Introduce un número: ");
    int numero = scanner.nextInt();
    while (numero <0) {
        System.out.print("El número debe ser mayor a 0. Inténtalo de nuevo: ");
        numero = scanner.nextInt();

    }
    return scanner.nextInt();
}
public static void main(String[] args) {
    int num = obtenerNumero();


    System.out.println("tu numero es :"+num);




}

}