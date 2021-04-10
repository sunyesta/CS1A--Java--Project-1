//holds the date of the class and can print it
public class Date{
	int month=1;
	int day=1;
	int year=1;
	
	//sets month to inputed parameter
	public void setMonth(int month){
		this.month = month;
	}
	
	//sets day to inputed parameter
	public void setDay(int day){
		this.day = day;
	}
	
	//sets year to inputed parameter
	public void setYear(int year){
		this.year = year;
	}
	
	public String toString(){
		return month+"/"+day+"/"+year;
	}
	
}