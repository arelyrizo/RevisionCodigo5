// el codigo debe funcionar cuando se escriba un numero y cuando elijamos 3,7,8,9  debera mostrarse 
//  que los numeros son afortunados, mientras que los demas numeros no seran afortunados.

package codigo5;
import java.util.Scanner; // primero se debe realizar la importacion de scanner 
//ya sea manualmente o mediante el editor de texto que estemos utilizando.
public class codigo5 {

	public static void main(String[] args) { // Agreue el static void main 
        
	    Scanner s = new Scanner (System.in);// se añadio system.in dentro de los parentesis  
	    System.out.print("Introduzca un número: ");// quite la comilla simple y agregue comilla doble al final 
	    String in = s.nextLine();
	    int c =Integer.parseInt(in); // agregue Integer.ParseInt, para convertir una cadena string 
        // y parentesis en ni para hacer qu el codigo funcione 
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (c > 0) {// se cambio ni por la c para que el caracter corresponda 
		  int digito = (c % 10); // quite (int) ya que al inicio 
          //ya le estamos especificando que debe ser de tipo entero y se cambio in por c  
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
            } //  agregue una llave para cerrar 
		  
		  c /= 10;// cambie el ni por c ya que debe correspoder el mismo caracter en todo.
	    }

	    if (afo > noAfo) {
	    	System.out.println("El " + in + " es un número afortunado.");
	    } else {
	      System.out.println("El " + in + " no es un número afortunado.");
		

	  }
    }
  }
