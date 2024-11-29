package codigo6;
//Se agrego la paqueteria u la utileria para el uso que java necesita en las clases, se agrego la funcion main y se corrigio la sintesis , ya con esto se imprime sin problemas  
import java.util.Scanner; // agregamos la utileria
public class codigo6 {

	public static void main(String[] args) { //agregamos la funcion main 
		// TODO Auto-generated method stub

		int[] n = new int[20];
       // el for genera numeros aleatorios entre 20 y 400
	    for (int i = 0; i < 20; i++) {// le fata un mas para el incremento y que sea de iteracion
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.println(n[i] + " ");
	    }
	    // sacamos el system out fuera del ciclo
	    System.out.println("\n¿Qué números quiere resaltar? ");// Falto una n 
	    System.out.println("(1 – los múltiplos de 5, 2 – los múltiplos de 7): "); // Falto ln
	    Scanner scanner = new Scanner(System.in);

	    //agregamos el scanner para entradas de ususario 
	    int opcion = scanner.nextInt(); // Falto un parentesis
//DETERMINA MULTIPLO SEGUN LA OPCION
	    int multiplo = (opcion == 1) ? 5 : 7; //  estaban al reves los simbolos
//usamos for en lugar de foreach  que nos ayuda a entrar al indice del array
	    
	    for(int e : n) { // solo es for en vez de each porque no es char es in estamos trabajando con numeros enteros
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] "); //resalta los numeros que cumplen la condicion
	      } else {
	        System.out.print(e + " "); // imprimimos con el sistem out en vez del in
	      }
	    }
	    scanner.close(); // Cerrar el Scanner

	  }
	}
