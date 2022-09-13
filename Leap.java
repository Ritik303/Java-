/* 1.Write a program to check if a year is leap year or not.
If a year is divisible by 4 then it is leap year but if the year is century year like 2000, 1900, 2100 then it must be divisible by 400.*/
import java.util.Scanner;
class Leap{
public static void main(String [] args ){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the year : ");
int y= sc.nextInt();
if(y%4==0){
	if(y%100==0){
		if(y%400==0){
	System.out.println("Leap year ");
}
	else{
	System.out.println("Not leap year ");
}

}
else{
System.out.println("Leap year");
}
}
else{
System.out.println("NOt leap year ");
}
}
}