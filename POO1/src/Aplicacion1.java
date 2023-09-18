import javax.swing.JOptionPane;

public class Aplicacion1 {
       public static void main(String args[]) {
    	   
    	   double ladoA;
    	   double ladoB;
    	   
    	   ladoA=ingresarDatos("ingrese la longitud del lado A: " );
    	   ladoB=ingresarDatos("ingrese la longitud del lado B: " );
    	   
    	   calcularArea (ladoA,ladoB);
    	   
       }
        
       public static double ingresarDatos (String mensaje) {
    	   
    	   String cadena;
    	   double valor;
    	   
    	   cadena = JOptionPane.showInputDialog(null, mensaje);
    	   valor =Double.parseDouble(cadena);
    	   
    	   return valor;
       }
       
       public static void calcularArea (double a, double b) {
    	   double resultado;
    	   resultado= a * b;
    	   
    	   JOptionPane.showMessageDialog(null, "El resultado es : " +resultado );
       }
       
}
