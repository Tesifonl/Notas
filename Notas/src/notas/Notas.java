package notas;

import java.util.Scanner;

public class Notas {

public static void main(String[] args) {
Scanner reader = new Scanner(System.in);// Para pedir un dato numérico por teclado
int numero = 0; // NOPMD by tesif on 25/2/23 7:18
String calificacion = ""; // NOPMD by tesif on 25/2/23 7:18
System.out.print("Introduzca el valor de una calificación: ");
numero = reader.nextInt();

if (numero >= 0 && numero < 5)
calificacion = "Suspenso";
else if (numero >= 5 && numero < 7)
calificacion = "Aprobado";
else if (numero >= 7 && numero <9)
calificacion = "Notable";
else if (numero >= 9 && numero <= 10)
calificacion = "Sobresaliente";
else
calificacion = "El valor de la calificación introducida no es correcta";

System.out.println(calificacion);
reader.close();
}
}
