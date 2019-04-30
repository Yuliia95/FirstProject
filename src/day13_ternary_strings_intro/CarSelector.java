package day13_ternary_strings_intro;
import java.util.Scanner;
public class CarSelector {
	public static void main(String[] args) {
			
		// American: Ford, Dodge, Tesla, Chevrolet, Lincoln
		// AveragePrice: 
		
		//Japanese: Toyota, Mitsubisi, Honda, Subaru, Mazda
		// AveragePrice: 32000
		
		// German: BMW< VW< Audi, Mercedes, Porshe 
		// AveragePrice: 85000
		
		// Italian: AlfaRomeo, Ferarri, Lamborgini,Fiat
		// AveragePrice: 85000
		
		//Korean: Kia
		
		Scanner scan = new Scanner(System.in);	
		System.out.println("Which type of car you are interesting in?");
		System.out.println(" 1)American\n 2)Japanese\n 3)German\n 4)Italian\n 5)Korean");
		
	int carType = scan.nextInt();
	double averagePrice = 0.0;
	String carOptions = "";
	String carOrigin = "";	
		
		
		switch(carType){
		case 1:
		averagePrice = 33000.0;
		carOptions = "Ford, Dodge, Tesla, Chevrolet, Lincoln";
	    carOrigin = "American";
	    break;
		
		case 2:
			averagePrice = 34000.0;
			carOptions = "Toyota, Mitsubisi, Honda, Subaru, Mazda";
		    carOrigin = "Japanese";
		    break;
		case 3:
			averagePrice = 5500.0;
			carOptions = "BMW, VW, Audi, Mercedes, Porshe ";
		    carOrigin = "Germaan";
		    break;
		case 4:
			averagePrice = 6500.0;
			carOptions = "AlfaRomeo, Ferarri, Lamborgini,Fiat";
		    carOrigin = "Italian";
		    break;
		case 5:
			averagePrice = 2500.0;
			carOptions = "Kia, Hundai, Daewoo";
		    carOrigin = "Korean";
		    break;
	    default:
	    	System.out.println("Car type not available");
	    	return; // stop execution. Don't run rest of code 
	    	}
		
	System.out.println("You selected "+carOrigin+" car and your options are "+carOptions+".");
	System.out.println("Average Price: "+averagePrice);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
