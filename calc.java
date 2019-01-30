import java.util.Scanner;
public class calc{
	public static void main(String args[]){
		float a,b,res;
		char choice, ch;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("My Calculator Program");
			System.out.print("1. ADD TWO NUMBERS\n");
			System.out.print("2. Exit\n\n");
			System.out.print("3. MULTIPLY TWO NUMBERS\n");
			System.out.println("4. SUBTRACT TWO NUMBERS\n");
			System.out.print("Enter Your Choice : ");
			System.out.print("Hello World : ");
			choice = scan.next().charAt(0);
			switch(choice){
				case '1' :  System.out.print("Enter Two Numbers : ");
							a = scan.nextFloat();
							b = scan.nextFloat();
							res = a+b;
							System.out.print("Result = "+res);
							break;
				case '2'  : System.exit(0);
							break;
				case '3' :  System.out.print("Enter Two Numbers : ");
							a = scan.nextFloat();
							b = scan.nextFloat();
							res = a*b;
							System.out.print("Result = "+res);
							break;			
				case '4' :  System.out.print("Enter Two Numbers : ");
                                                        a = scan.nextFloat();
                                                        b = scan.nextFloat();
                                                        res = a-b;
                                                        System.out.print("Result = "+res);
                                                        break;

				default   : System.out.print("INVALID CHOICE !!!");
							break;
			}
			System.out.print("\n---------------\n");
		}while(choice != 2);
	}
}
