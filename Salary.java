/* A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount.*/
import java.util.Scanner;
class Salary{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter year of service : ");
	int y=sc.nextInt();
	System.out.println("Enter your salary : ");
	int s=sc.nextInt();
	if(y>5){
		float b=((s*5)/100)+s;
		System.out.print("Your net salary is : ");
		System.out.println(b);
}
	else{
		System.out.print("Your net salary is : ");
		System.out.println(s);
		
}
}
}