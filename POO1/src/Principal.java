import javax.swing.JOptionPane;

public class Principal {

	Flecha flecha1,flecha2,flecha3;
	int largo;
	
	public static void main(String[]args) {
		Principal miPrincipal=new Principal();
	}
	
	public Principal() {
		flecha1=new Flecha();
		flecha1.construirFlecha();
		flecha1.imprimirEspacio();
		
		flecha2=new Flecha();
		flecha2.longitud=Integer.parseInt(JOptionPane.showInputDialog("ingrese la longitud de la flecha 2"));
		flecha2.color="rojo";
		flecha2.construirFlecha();
		flecha2.imprimirEspacio();
	
		largo=Integer.parseInt(JOptionPane.showInputDialog("ingrese la longitud de la flecha 3"));
		flecha3=new Flecha(largo,"negro");
		flecha3.construirFlecha();
		flecha3.imprimirEspacio();
	}
}
