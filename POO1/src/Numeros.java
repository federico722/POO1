import javax.swing.JOptionPane;

public class Numeros {
    // se crean las variables y declaran en global
	int numer;
	int i,neg=0,par=0;
	
	/*
	 * el metodo entrada empieza con un ciclo, de 0 a 5 repeticiones, se detiene 
	 * cuando llega al quinto ciclo 
	 * dentro del cuerpo del ciclo se inicia el metodo dentro de la variable numer,
	 * luego pasa a la condicion que verifica si la variable numer, es un numero par
	 *  la variable dentro del condicional,llamada par aumenta en 1, 
	 * funcionando como un contador
	 * si no, pasa al siguiente condicional 
	 * donde verifica que la varibale se un numero negativo
	 * si es un numero negativo la variable llamada neg
	 * dentro del condicional aumenta en 1,
	 * 
	 * despues de que termine el ciclo se imprime un mensaje donde le dice cuantos
	 * numeros son par y cuantos negativos
	 * 
	 */
	
	public void entrada(){
	  for (int i = 0; i < 5; i++) {
		numer=ingresarDatos("digite 1 numero");
		if (numer%2==0) {
			par++;
		}
		if (numer<0) {
			neg++;
		}
	}
	  
	  JOptionPane.showMessageDialog(null,"el numero de numeros pares es: "+par+"\n"
	  +"y el numero de numeros negativos es: "+neg);
	 	
	}
	
	/*
	 * 
	 */
	public static int ingresarDatos(String mensaje) {
		String cadena;
		int valor;
		cadena=JOptionPane.showInputDialog(null, mensaje);
		valor=Integer.parseInt(cadena);
		return valor;
	}
	
}
