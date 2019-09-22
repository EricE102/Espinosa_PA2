import java.util.Scanner;
public class Espinosa_p01 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(System.in);
			String four_digits;
			System.out.print("Input a four digit integer: ");
			four_digits = scnr.nextLine();
			while(four_digits.length() < 1000000000) {
				if(four_digits.length() == 4 ) {
					//convert the string to int
					int encrypt = Integer.parseInt(four_digits);	
					
					//do the math required to encrypt the digits
					int a, b, c, d;
					a = (((encrypt/1000) + 7) %10);
					b = (((encrypt/100) + 7) %10);
					c = (((encrypt/10) + 7) %10);
					d = (((encrypt) + 7) %10);
				
					//swap digits
					int encrypt_ac; //swap a and c
					encrypt_ac = a;
					a = c; 
					c = encrypt_ac;
					
					int encrypt_bd; //swap b and d
					encrypt_bd = b;
					b = d;
					d = encrypt_bd;
				
					System.out.print(a);
					System.out.print(b);
					System.out.print(c);
					System.out.println(d);
					break;
					
				}
				
				else {
					System.out.println("It has to be a 4 digit number, please try again.");
					four_digits = scnr.nextLine();
					continue;
				}
			}
			
			System.out.print("Enter a four digit number to decrypt: ");
			four_digits = scnr.nextLine();	
			
			

			scnr.close();	
	
	}
				
}


