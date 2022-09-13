/* A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.*/
import java.util.Scanner;
class Percent{
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter number of classes held : ");
	float n= sc.nextfloat();
	System.out.println("ENter number of classes attended : ");
	float m= sc.nextfloat();
	float x=(m*100)/n;
if(x>75){
	System.out.println("ALLOWED FOR EXAM  : "+x);

}
else{
	System.out.println(" NOT ALLOWED FOR EXAM : "+x);
}
}
}