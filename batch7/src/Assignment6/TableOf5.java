 /*Design method void multiplication (int no) and print the multiplication table. ( Example enter the no=5 then output like 
5*1=5.......5*10=50)*/


package Assignment6;

public class TableOf5 {
	
	public static int multi(int a) {
	return a;
	}
	
	

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++)
		{
			
			int b=multi(5)*i;
			System.out.println("5*" +i +" =" + ""+b);
		}
		
		}

	}


