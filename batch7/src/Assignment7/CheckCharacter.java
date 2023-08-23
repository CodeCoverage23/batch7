 //Design method to check whether the character is alphabet, digit and special symbol.

package Assignment7;

import java.util.Scanner;

public class CheckCharacter {
	
	public static char check(char lett) {
		
		char ch=lett;
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' )
		
		System.out.println("character is alphabet");
		
		if(ch>='!' && ch<='=' )
		
			System.out.println("character is special symbol");
		
		if(ch>='0' && ch<='9' )
			
			System.out.println("character is number");
		
		return (lett);
	}

	public static void main(String[] args) {
		
		Scanner letter=new Scanner(System.in);
		System.out.println("enter a alphabet or digit  or special symbol ");
		char lett= letter.next().charAt(0);
		
		check(lett);
	

}
}