package notas;

import java.util.Scanner;

public class Notas {

public static void main(String[] args) {
Scanner reader = new Scanner(System.in);// Para pedir un dato numérico por teclado
int numero = 0; // NOPMD by tesif on 25/2/23 7:18
String calificacion = ""; // NOPMD by tesif on 25/2/23 7:18
System.out.print("Introduzca el valor de una calificación: ");
numero = reader.nextInt();

calificacion = Califica.califica(numero);

System.out.println(calificacion);
reader.close();
}

/**
 * @param numero introducido
 * @return la calificacion correspondiente al numero
 * @deprecated Use {@link Califica#califica(int)} instead
 */
public static String cali(int numero) {
	return Califica.califica(numero);
}

/**
 * @param num_nota introducido
 * @return la calificacion correspondiente al numero
 * @deprecated Use {@link Califica#califica(int)} instead
 */
public static String califica(int num_nota) {
	return Califica.califica(num_nota);
}
}
