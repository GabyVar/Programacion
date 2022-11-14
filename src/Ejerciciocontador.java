import java.util.Scanner;

public class Ejerciciocontador {

	/**
	 * @Gabyvargas C.I: 28.497.195
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String cadena = "";
		 char [] Arraycadena;
		 char caracter;
		 int contador=0;
		     System.out.println ("Escriba una palabra: ");
		     Scanner Leer=new Scanner(System.in);
			 cadena = Leer.nextLine(); 
			 Arraycadena = cadena.toCharArray();
			 for (int i = 0; i < Arraycadena.length; i++){
			     caracter = Arraycadena [i];
      	     for (int j = 0; j < Arraycadena.length; j++){
			         if (Arraycadena[j] == caracter) {
			             contador++;
			         }
			     }
                    if(contador == 1) {
			     System.out.println("La letra "+Arraycadena[i]+ " se ha repetido "+ contador+" vez");
			     contador = 0;}
                    else { 
                System.out.println("La letra "+Arraycadena[i]+ " se ha repetido "+ contador+" veces");
   			 contador = 0;}

			 }
     }

	}