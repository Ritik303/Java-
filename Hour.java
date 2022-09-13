import java.util.Scanner;
class Hour{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter hours : ");
int h= sc.nextInt();
System.out.println("Enter Rate : ");
float r=sc.nextFloat();
if (h<9){
	float a=h*r;
	System.out.println(a);
}
else{
	float b= (float)(8*r + (h-8)*(r*1.5));
	System.out.println(b);	
}

}
}