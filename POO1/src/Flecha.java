
public class Flecha {
       int longitud;
       String color;
       
       public void construirFlecha() {
    	   for (int i = 0; i < longitud; i++) {
			imprime("-");
		}
    	   imprime(">");
       }
       
       public Flecha() {
    	   longitud=18;
    	   color="negro";
       }
       
       public void imprimirEspacio() {
    	   System.out.println();
       }
       
       
       private void imprime(String simbolo) {
    	   if(color.equals("negro")) {
    		   System.out.print(simbolo);
    	   }else {
    		   System.out.print(simbolo);
    	   }
       }
       
       public Flecha(int longitud,String color) {
    	   this.longitud=longitud;
    	   this.color=color;
       }
       
       
}
