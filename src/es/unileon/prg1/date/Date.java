package es.unileon.prg1.date;

import java.util.Calendar;
import java.text.DateFormatSymbols;

/**
 * @author eduardojuarezrobles
 *
 */
class Date{

	private int _day;
	private int _month;
	private int _year;

	
	public  Date(int day, int month, int year) throws DateException{
		/*if(_month<1 || _month>12){
			throw new DateExceptions ("Date error: valor "+ _month+ " no es valido. El valor debe estar entre 1 y 12");
		}else if(_day<1 || _day > this.daysOfMonth()){
			throw new DateExceptions ("Date error: valor "+ _day+ " no es valido. El valor debe estar entre 1 y 31");
		}else if(_year>0){
			throw new DateExceptions ("Date error: valor "+ _year+ " no es valido. El valor debe ser mayor a uno");
		}else{*/
			this._day=day;
			this._month=month;
			this._year=year;
		//}
	}
	

	public Date() throws DateException {
		Date fecha= new Date(1,1,2017);
	}


	public int getDay() throws DateException{
		if(_day<1 || _day > this.daysOfMonth()){
			throw new DateException ("Date error: valor "+ _day+ " no es valido. El valor debe estar entre 1 y 31");
		}
		return _day; 
	}

	public void setDay(int _day) {
		this._day = _day;
	}

	public int getMonth() throws DateException{
		if(_month<1 || _month>12){
			throw new DateException ("Date error: valor "+ _month+ " no es valido. El valor debe estar entre 1 y 12");
		}
		return _month; 
	}

	public void setMonth(int _month) {
		this._month = _month;
	}

	public int getYear() throws DateException{
		if(_year<0){
			throw new DateException ("Date error: valor "+ _year+ " no es valido. El valor debe ser mayor a uno");
		}
		return _year; 
	}

	public void setYear(int _year) {
		this._year = _year;
	}

	public boolean isSameYear(Date otherDate) throws DateException{
		if (otherDate.getYear() == getYear()){
			return true;
		}else{
			return false;
		}
	}

	public boolean isSameMonth(Date otherDate) throws DateException{
		if (otherDate.getMonth()  == getMonth()){
			return true;
		}else{
			return false;
		}
	}

	public boolean isSameDay(Date otherDate) throws DateException{
		if (otherDate.getDay() == getDay()){
			return true;
		}else{
			return false;
		}
	}

	public boolean isSame(Date otherDate) throws DateException{
		if (isSameYear(otherDate) && isSameMonth(otherDate) && isSameDay(otherDate) ){
			return true;
		}
		return false;

	}
	public String getMonthName() throws DateException{
		String name =" ";
		switch (getMonth()){
		case 1:
			name = "January";
			break;
		case 2:
			name = "February";
			break;
		case 3:
			name = "March";
			break;
		case 4:
			name = "April";
			break;
		case 5:
			name = "May";
			break;
		case 6:
			name = "June";
			break;
		case 7:
			name = "July";
			break;
		case 8:
			name = "August";
			break;
		case 9:
			name = "September";
			break;
		case 10:
			name = "October";
			break;
		case 11:
			name = "November";
			break;
		case 12:
			name = "December";
			break;
		}
		return name;
	}

	public int daysOfMonth() throws DateException{
		int number = 0;
		switch (getMonth()){
		case 1: 
			number = 31;
			break;
		case 2:
			number = 28;
			break;
		case 3: 
			number = 31;
			break;
		case 4: 
			number = 30;
			break;
		case 5: 
			number = 31;
			break;
		case 6: 
			number = 30;
			break;
		case 7: 
			number = 31;
			break;	
		case 8: 
			number = 31;
			break;
		case 9: 
			number = 30;
			break;
		case 10: 
			number = 31;
			break;
		case 11: 
			number = 30;
			break;
		case 12:
			number = 31;
			break;
		}
		return number;
	}
	public boolean isCorrectDays() throws DateException{
		return (getDay() > 0) && (getDay() <= daysOfMonth() );
	}
	public String getSeasonName() throws DateException{
		String estacion =" ";
		switch (getMonth()){
		case 1: 
			estacion = "Winter";
			break;
		case 2:
			estacion = "Winter";
			break;
		case 3: 
			estacion = "Winter";
			break;
		case 4: 
			estacion = "Spring";
			break;
		case 5: 
			estacion = "Spring";
			break;
		case 6: 
			estacion = "Spring";
			break;
		case 7: 
			estacion = "Summer";
			break;	
		case 8: 
			estacion = "Summer";
			break;
		case 9: 
			estacion = "Summer";
			break;
		case 10: 
			estacion = "Autumn";
			break;
		case 11: 
			estacion = "Autumn";
			break;
		case 12:
			estacion = "Autumn";
			break;
		}
		return estacion;
	}

	public void cantidadMeses() throws DateException{
		int i=0;
		System.out.println("Falta estos "+(12-getMonth()+1)+" meses para que termine el año: ");
		for (i=getMonth();i<13;i++){

			System.out.println("-El mes de: "+getMonthName2(i));

		}

	}
	private String getMonthName2(int meses){
		String name =" ";
		switch (meses){
		case 1:
			name = "January";
			break;
		case 2:
			name = "February";
			break;
		case 3:
			name = "March";
			break;
		case 4:
			name = "April";
			break;
		case 5:
			name = "May";
			break;
		case 6:
			name = "June";
			break;
		case 7:
			name = "July";
			break;
		case 8:
			name = "August";
			break;
		case 9:
			name = "September";
			break;
		case 10:
			name = "October";
			break;
		case 11:
			name = "November";
			break;
		case 12:
			name = "December";
			break;
		}
		return name;
	}
	
	public Date tomorrow() throws DateException {
		Date retorno= new Date(getDay()+1, getMonth(), getYear());
		return retorno;
	}

	@Override
	public String toString() {
		//System.out.println(_day + "/" + _month + "/" + _year+"me cago en la hostia");
		return _day + "/" + _month + "/" + _year;
	}
	

	public Object dayOfWeek(int i) throws DateException {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, getYear());
		calendar.set(Calendar.MONTH, getMonth());
        calendar.set(Calendar.DAY_OF_YEAR, 365);
		int weekday = calendar.get(Calendar.DAY_OF_WEEK);
		DateFormatSymbols dfs = new DateFormatSymbols();
		String dia= dfs.getWeekdays()[weekday];
		return dia;
	}


	

}

