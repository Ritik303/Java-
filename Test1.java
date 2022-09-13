import java.util.Scanner;
import java.util.Arrays;

class Test1{
public static void main(String[] args){

int[] arr1 ={10,20,30,40,50,60,70,80,90,100};
//arr1 = new int[11];  // valid.
int[] arr2 = new int[arr1.length];
for(int i=0;i<arr1.length;i++){
	arr2[i]= arr1[i];
	
}
System.out.println(Arrays.toString(arr2));

arr1=new int[arr2.length + 1];
for(int i=0; i<arr2.length;i++){
	arr1[i]= arr2[i];
}
Scanner sc= new Scanner(System.in);
int a=sc.nextInt();
arr1[arr2.length] = a;
System.out.println(Arrays.toString(arr1 ));

}
}