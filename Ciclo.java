import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ciclo {
public static int obtenerNumero() {
    int num = -1;
    while (num < 0 ) {
    String numero= JOptionPane.showInputDialog("Introduce un número: ");
    num = Integer.parseInt(numero);

    }
    return num;
}
public static void main(String[] args) {
    int num = obtenerNumero();
    System.out.println("tu numero es :"+num);




}

}