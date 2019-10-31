

public class MainDate{


	public static void main(String args[]){

		/*Date fecha;

		try {
			fecha = new Date(30, 10, 2019);
			System.out.println(fecha.toString());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}*/
		Date fecha= new Date(30,10,2019);
		Date fecha2= new Date(31,10,2019);

		System.out.println("Es el mismo año: " +fecha.isSameYear(fecha2));
		System.out.println("Es el mismo mes: " +fecha.isSameMonth(fecha2));
		System.out.println("Es el mismo dia: " +fecha.isSameDay(fecha2));
		System.out.println("Es correcta la fecha: "+fecha.isSame(fecha2));
		System.out.println("El mes es: "+fecha.getMonthName());
		System.out.println("El dia es: "+fecha.isCorrectDays());
		System.out.println("La estacion es: "+fecha.estaciones());
		fecha.cantidadMeses();
	}
}
