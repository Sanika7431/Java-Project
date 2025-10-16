package JAVA;

class Continent{
	String place;
	Continent(String place){
		this.place=place;
	}
	void displayContinent() {
		System.out.println("Place:" + place);
	}
}
class Country extends Continent{
	String country;
	Country( String place,String country){
		super(place);
		this.country=country;
	}
	void displayCountry() {
		displayContinent();
		System.out.println("Country:" + country);
	}
}
class States extends Country{
	String states;
	States(String place,String country,String states){
		super(place,country);
		this.states=states;
	}
	void displayStates() {
		displayCountry();
		System.out.println("States:" + states);
	}
	void displayDetails() {
		displayContinent();
		displayCountry();
		displayStates();
	}
}
public class ContinentMain {
public static void main(String[] args) {
	States s = new States("Asia","India","Maharastra");
	s.displayDetails();
}
}
