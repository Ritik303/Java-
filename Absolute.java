/* Write a program to print absolute vlaue of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1 */
import java.util.Scanner;
class Absolute{
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number ");
	int n= sc.nextInt();
if(n<0){
	n=-1*n;
	System.out.println("Absolute value is : "+n);
}
else{
	System.out.println("Absolute value is : "+n);
}
}
}