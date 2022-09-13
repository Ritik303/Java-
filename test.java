import java.util.Arrays;
class Employee{
	String name;
	double salary;
	Employee(String name, double salary){
	this.name=name;
	this.salary=salary;
}
class Test{
public static void main(String[] args){
Employee e1=new Employee("ANil",200000);

Employee e2=new Employee("Manish",240000);

Employee e3=new Employee("Vaibhav",440000);

Employee e4=new Employee("Duke",780000);

Employee e5=new Employee("KTM",980000);

Employee e6=new Employee("Haybussa",770000);

Employee e7=new Employee("Raju",976000);

Employee e8=new Employee("Dgay",10000);

Employee e9=new Employee("kanishk",478753);

Employee e10=new Employee("Gaurav",784798757);

Employee[] arr=new Employee[10];
arr[0]=e1;
arr[1]=e2;
arr[2]=e3;
arr[3]=e4;
arr[4]=e5;
arr[5]=e6;
arr[6]=e7;
arr[7]=e8;
arr[8]=e9;
arr[9]=e10;


double ans=0;
int index=-1,i=0;
String name="";
while(i<arr.length){
	if(arr[i].salary>ans){
	index=i;
	name=arr[i].name;
}
i++;
}
System.out.println(name+"has maximum salary"+ans);

}
}