import javax.swing.JOptionPane;

public class Pane {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre:");
        String edad = JOptionPane.showInputDialog("Ingresa tu edad:");
        int edad1 = Integer.parseInt(edad);

        String mensaje = "Nombre: " + nombre + "\nEdad: " + edad1;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}