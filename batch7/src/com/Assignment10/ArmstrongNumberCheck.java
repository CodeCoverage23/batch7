//3. Write java program to check whether number is Armstrong or not.
//(A positive number is called armstrong number if it is equal to the sum of cubes of its digits
//for example 0, 1, 153, 370, 371, 407 etc. Let's try to understand why 153 is an Armstrong number.
//153 = (1*1*1)+(5*5*5)+(3*3*3)  


package com.Assignment10;
import java.util.Scanner;
public class ArmstrongNumberCheck {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();
		        scanner.close();

		        if (isArmstrongNumber(number)) {
		            System.out.println(number + " is an Armstrong number.");
		        } else {
		            System.out.println(number + " is not an Armstrong number.");
		        }
		    }

		    public static boolean isArmstrongNumber(int number) {
		        int originalNumber, remainder, result = 0, n = 0;

		        originalNumber = number;

		        // Count the number of digits in the number
		        while (originalNumber != 0) {
		            originalNumber /= 10;
		            ++n;
		        }

		        originalNumber = number;

		        // Calculate the sum of the cubes of its digits
		        while (originalNumber != 0) {
		            remainder = originalNumber % 10;
		            result += Math.pow(remainder, n);
		            originalNumber /= 10;
		        }

		        // Check if the result is equal to the original number
		        return result == number;
		    }
		}


	


