/* Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).*/
import java.util.Scanner;
class Case{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the character : ");
	char a= sc.next().charAt(0);
	int b=a;
	if (b>64 && b<91){
		System.out.println("UPPER case ");
}
	else if (b>96 && b<123){
		System.out.println("LOWER case ");
}
 	else{
		System.out.println("NO case");
}
}
}