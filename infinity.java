import java.util.Scanner;
class student{}
class emplpoyee{}

class infinity{
	public static void main(String[] args){
	
	//Scanner sc = new Scanner(System.in);
	//student s= new student();
	//employee e= new employee();
	
	//int a=10;
	//int b=20;
	
	//int x= a>b ? a*2.0 : b*3.0;    //errror because int can't store a float.
	//int x= a>b ? a*2 : b*3;   // no error 

	//int a=20;
	//int b=30;
	//int c=10;
	

	//int x=a>b && a>c? a:b>c? b:c; 


	//System.out.println(e instanceof object);
	//System.out.println(3>1 & 3>2);// true.
	//System.out.println(true & false);// false.
	//Leap year code
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
	String s=(a%400 ==0)||(a%4==0 && a%100 !=0)? "leap year" : "not leap";
	System.out.println(s);
	


}
}