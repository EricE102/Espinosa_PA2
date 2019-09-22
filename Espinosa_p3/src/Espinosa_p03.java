import java.util.Scanner;
public class Espinosa_p03 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		 // create a string with the 5 topics
		String[] Topics = {"Video Games", "Food", "Money", "Sleep", "Love"};
		// Create a double array for the inputs
		int [][] Responses = new int [Topics.length][];
		int Num_People;
		int i, j;
		int Input;
		
		//set arrays to 0
		for(i=0; i < Responses.length; i++){
			Responses[i] = new int[10];

			for(j=0; j < Responses[i].length; j++) {
				Responses[i][j] = 0;
			}
		}
		
		//ask for input on how many times the poll will repeat
		System.out.println("How many people will be taking the poll?");
		Num_People = scnr.nextInt();
	
		for(i=0; i < Num_People; i++){
			System.out.println(" ");
			System.out.println("User [" + (i + 1) + "] - Give a rating between [1-10] for the " + Topics.length + " Topics : ");
			//Ask user for their rating
            for(j=0; j < Topics.length; j++){
            	System.out.print("What is your rating for " + Topics[j] + " : ");
            	Input = scnr.nextInt();
            	//Set parameters in case they put an input outside of 10 or less than 0
            	while(Input < 1 || Input > 10){
            		System.out.println("Input should be between [1-10] Please try again");
            		System.out.print("What is your rating for " + Topics[j] + " : ");
            		Input = scnr.nextInt();
            	}
            	//Increment the responses
            	Responses[j][Input-1]++;
            }
		}
		
		//create array for average ratings, initialize string for most points and initialize variables
		int avg_Rating[] = new int[Topics.length];
		String most_Points = "" , least_Points  = "" ;
		int most_Point_Total = 0; 
		int least_Point_Total = 0;

		//used to calculate average rating, the topic with most points, and topic with least points
		for(i=0; i < Responses.length; i++){
			avg_Rating[i] = 0;
			
			for(j=0; j < Responses[i].length; j++){
				avg_Rating[i] += (Responses[i][j] * (j + 1));
			}
			
			if(i == 0){
				most_Point_Total = avg_Rating[i];
				least_Point_Total = avg_Rating[i];
				most_Points = Topics[i];
				least_Points = Topics[i];
			}
			
			else{
				if(avg_Rating[i] > most_Point_Total){
					most_Points = Topics[i];
					most_Point_Total = avg_Rating[i];
				}
				
				if(avg_Rating[i] < least_Point_Total){
					least_Points = Topics[i];
					least_Point_Total = avg_Rating[i];
				}
			}
			
			avg_Rating[i] = avg_Rating[i] / Num_People;
		}

		
		//used to output the tabular answers, i was a little confused on how to do it and i struggled a lot,
		//so i had to google on some tips on how to do it. I kept trying the simple way of doing /t but nothing 
		//was aligning for me. 
		System.out.printf("\n%-20s", "");
		//this for loop is to print the title of the rows of the table
		for(i = 0; i < 10; i++){
			System.out.printf("%-10d" ,(i + 1));
		}
		System.out.printf("%20s", "Average Rating");
		System.out.println();
		//for loop used to print the topic names first in the line
		for(i = 0; i < Responses.length; i++){
				System.out.printf("\n%-20s", Topics[i]);
				//for loop used to print out the responses
				for(j = 0; j < Responses[i].length; j++){
					System.out.printf("%-10d", Responses[i][j]);
				}
				System.out.printf("%20d", avg_Rating[i]);

        }
			
	//used to output the topic with the most points and the topic with the least points. 
	System.out.println("\nThe topic with the most points is: " + most_Points);
	System.out.println("The topic with the least points is:  : " + least_Points);

	scnr.close();
	}

}
