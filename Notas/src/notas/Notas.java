package notas;

import java.util.Scanner;

public class Notas {

public static void main(String[] args) {
Scanner reader = new Scanner(System.in);// Para pedir un dato numérico por teclado
int numero = 0; // NOPMD by tesif on 25/2/23 7:18
String calificacion = ""; // NOPMD by tesif on 25/2/23 7:18
System.out.print("Introduzca el valor de una calificación: ");
numero = reader.nextInt();

calificacion = califica(numero);

System.out.println(calificacion);
reader.close();
}

/**
 * @param numero introducido
 * @return la calificacion correspondiente al numero
 * @deprecated Use {@link #califica(int)} instead
 */
public static String cali(int numero) {
	return califica(numero);
}

/**
 * @param num_nota introducido
 * @return la calificacion correspondiente al numero
 */
public static String califica(int num_nota) {
	String calificacion;
	if (num_nota >= 0 && num_nota < 5)
	calificacion = "Suspenso";
	else if (num_nota >= 5 && num_nota < 7)
	calificacion = "Aprobado";
	else if (num_nota >= 7 && num_nota <9)
	calificacion = "Notable";
	else if (num_nota >= 9 && num_nota <= 10)
	calificacion = "Sobresaliente";
	else
	calificacion = "El valor de la calificación introducida no es correcta";
	return calificacion;
}
}
