import javax.swing.JOptionPane;

public class CastingDecimal {
    public static void main(String[] args) {
        
        String num1 = JOptionPane.showInputDialog("Ingresa el primer número entero:");
        int numero1 = Integer.parseInt(num1);

        
        String num2 = JOptionPane.showInputDialog("Ingresa el segundo número entero:");
        int numero2 = Integer.parseInt(num2);

        
        double decimal1 = (double) numero1;
        double decimal2 = (double) numero2;

        
        String mensaje = "Primer número como decimal: " + decimal1 +
                         "\nSegundo número como decimal: " + decimal2;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}