
public class Ciclo {
private static final Scanner scanner = new Scanner(System.in);

public static int obtenerNumero() {
    System.out.print("Introduce un número: ");
    return scanner.nextInt();
}
public static void main(String[] args) {
    int numero = obtenerNumero();

    while (numero < 0) {
        numero = obtenerNumero();
    }

    System.out.println("Fin del programa");







}