import java.util.Scanner;
public class Espinosa_p02 {

	public static void main(String[] args) {
	    Scanner scnr = new Scanner(System.in);
	    //initialize variables
		double WeightKilos;
		double WeightPounds;
		double HeightMeters;
		double HeightInches;
		//ask user between kh/m or lbs/inches
		System.out.print("BMI Calculator: Would you like your BMI calculated in kilograms/meters or pounds/inches?");
		System.out.println(" (1 for kilograms/meters, 2 for pounds/inches)");
		int x = 0;
		x = scnr.nextInt();
		
		while(x < 10000)
		//Calculated in kilo/meter
		if(x == 1) {
			System.out.println("What is your weight in kilograms?");
			WeightKilos = scnr.nextDouble();
			System.out.println("What is your height in meters?");
			HeightMeters = scnr.nextDouble();
			double BMI_Metric = WeightKilos / (HeightMeters * HeightMeters);
			System.out.print("\nYour current BMI is: ");
			System.out.printf("%.2f\n", BMI_Metric); 
			System.out.println("");
			System.out.println("Compare your score - BMI Categories: ");
			System.out.println("Underweight = <18.5"); 
			System.out.println("Normal weight = 18.5–24.9"); 
			System.out.println("Overweight = 25–29.9");
			System.out.println("Obesity = BMI of 30 or greater");
			break;
		}
		//calculated in feet/pound
		else if(x == 2) {
			System.out.println("What is your weight in pounds?");
			WeightPounds = scnr.nextDouble();
			System.out.println("What is your height in inches?");
			HeightInches = scnr.nextDouble();
			double BMI_Imperial = ((703 * WeightPounds) / (HeightInches * HeightInches));
			System.out.println("\nYour current BMI is: ");
			System.out.printf("%.2f", BMI_Imperial); 
			System.out.println("");
			System.out.println("Compare your score - BMI Categories: ");
			System.out.println("Underweight = <18.5"); 
			System.out.println("Normal weight = 18.5–24.9"); 
			System.out.println("Overweight = 25–29.9");
			System.out.println("Obesity = BMI of 30 or greater");
			break;
		}
		//if they dont input 1 or 2
		else {
			System.out.println("Please Input 1 or 2.");
			x = scnr.nextInt();
			continue;
			
		}
		scnr.close();
	}

}

