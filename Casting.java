import javax.swing.JOptionPane;

public class Casting {
    public static void main(String[] args) {
        
        String num1 = JOptionPane.showInputDialog("Ingresa el primer número entero:");
        int numero1 = Integer.parseInt(num1);

        String num2 = JOptionPane.showInputDialog("Ingresa el segundo número entero:");
        int numero2 = Integer.parseInt(num2);

        double decimal1 = (double) numero1;
        double decimal2 = (double) numero2;

        // Operaciones
        double suma = decimal1 + decimal2;
        double resta = decimal1 - decimal2;
        double multiplicacion = decimal1 * decimal2;
        double division = decimal2 != 0 ? decimal1 / decimal2 : Double.NaN;
        String mensaje = "Primer número como decimal: " + decimal1 +
                         "\nSegundo número como decimal: " + decimal2 +
                         "\n\nSuma: " + suma +
                         "\nResta: " + resta +
                         "\nMultiplicación: " + multiplicacion +
                         "\nDivisión: " + division;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}