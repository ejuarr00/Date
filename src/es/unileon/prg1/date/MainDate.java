package es.unileon.prg1.date;


public class MainDate{


	public static void main(String args[]) throws DateExceptions{

		/*Date fecha= new Date(1, 1, 1);

		try {
			fecha = new Date(30, 10, 2019);
			System.out.println(fecha.toString());
		} catch (DateExceptions e) {
			System.out.println(e.getMessage());
		}*/
		Date fecha= new Date(30,10,2019);
		Date fecha2= new Date(31,10,2019);

		System.out.println("Son el mismo año "+ fecha.getYear()+" y "+ fecha2.getYear()+ ": " +fecha.isSameYear(fecha2));
		System.out.println("Son el mismo mes "+ fecha.getMonthName()+" y "+ fecha2.getMonthName()+ ": " +fecha.isSameMonth(fecha2));
		System.out.println("Son el mismo dia "+ fecha.getDay()+" y "+ fecha2.getDay()+ ": " +fecha.isSameDay(fecha2));
		System.out.println("Son iguales las fechas: "+fecha.isSame(fecha2));
		System.out.println("El mes numerico "+ fecha.getMonth()+ " es: "+fecha.getMonthName());
		System.out.println("El dia es: "+fecha.isCorrectDays());
		System.out.println("La estacion de la fecha "+ fecha.getMonthName()+ " es: "+fecha.estaciones());
		fecha.cantidadMeses();
	}
}
