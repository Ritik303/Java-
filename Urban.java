/* 2.Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
if employee is female, then she will work only in urban areas.

if employee is a male and age is in between 20 to 40 then he may work in anywhere

if employee is male and age is in between 40 t0 60 then he will work in urban areas only.

And any other input of age should print "ERROR".*/
import java.util.Scanner;
class Urban{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter Gender : ");
char g=sc.next().charAt(0);
System.out.println("ENter age : ");
int a= sc.nextInt();
System.out.println("Enter marital status : ");
char m=sc.next().charAt(0);
if(g==f || g==F){
System.out.println("Work in urban Areas");
}
else if(g==m || g==M && a>20 && a<40){
System.out.println("WOrk anywhere ");
}
else {
System.out.println("Work in urban areas only");
}
}
}