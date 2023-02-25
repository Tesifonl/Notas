package notas;

public class Califica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
