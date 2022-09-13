/*Take input of age of 3 people by user and determine oldest and youngest among them.*/
import java.util.Scanner;
class Age{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter age of first person");
	int a=sc.nextInt();
	System.out.println("Enter age of second person");
	int b=sc.nextInt();
	System.out.println("Enter age of third person");
	int c=sc.nextInt();
	int x=a>b && a>c ? a:b>c?b:c;
	System.out.println("The older is : "+x);
	int y=a<b && a<c? a:b<c?b:c;
	System.out.println("The younger is : "+y);
	
}
}