/* A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.*/
import java.util.Scanner;
class discount{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of units : ");
		int a= sc.nextInt();
		int b= a*100;
		if(b>1000){
	float c=b-((b*10)/100);
	System.out.println(c);
}
		else{
	System.out.println(b) ;	
}
}
}