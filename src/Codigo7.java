import java.util.HashMap;
import java.util.Scanner;

public class Codigo7 {
	//se agrega metodo main
	public static void main(String[] args) {
		//se importa Scanner de java util y se pasa como argumento el metodo system.in
		   Scanner s = new Scanner(System.in);
		   	//se importa packete de hashmap y se eliminan parentesis extra, se cambia el nombre ca por capitales
		   // se cambian los argumentos del hashmap por string ya qu eeso estara manejando
		    HashMap<String, String> capitales = new HashMap<>();

		    capitales.put("Canadá", "Otawwa");
		    capitales.put("Estados Unidos", "Washington DC");
		    capitales.put("México", "México DF");
		    capitales.put("Belice", "Belmopán");
		    capitales.put("Costa rica", "San José");
		    //se agrega la capital del salvador
		    capitales.put("El Salvador", "San Salvador");
		    capitales.put("Guatemala", "Ciudad de Guatemala");
		    capitales.put("Honduras", "Tegucigalpa");
		    capitales.put("Nicaragua", "Managua");
		    capitales.put("Panamá", "Panamá");
		   //se corrige error de sintaxis
		    String c = "";
		    do {
		    	//se corrige system.in por system.out
		      System.out.print("Escribe el nombre de un país y te diré su capital: ");
		      //se corrige el metodo de entrada del scanner de nextdouble por nextline para manejar cadena de texto
		      c = s.nextLine();
		   
		      //se corrige sintaxis de .equals
		      if (!c.equals("salir")) {
		    	  //se corrige metodo que busca valor en lugar de la llave que es el pais
		        if (capitales.containsKey(c)) {
		          System.out.print("La capital de " + c);
		          //se cambia metodo .put por .get ya que se quiere obtener el valor de la llave, no cambiar un valor
		          System.out.println(" es " + capitales.get(c));
		        } else {
		          System.out.print("No conozco la respuesta ");
		          System.out.print("¿cuál es la capital de " + c + "?: ");
		          String ca = s.nextLine();
		          
		          capitales.put(c, ca);
		          System.out.println("Gracias por enseñarme nuevas capitales");
		        }
		      }
		    } while (!c.equals("salir"));
		    //se corrige sintaxis de wile a while
		  }//main
	}//class

 

