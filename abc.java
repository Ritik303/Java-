import java.util.Scanner;
import java.util.Arrays;
class ABC{
public static void main(String[] args){
int[] arr1={1,2,3,4,5,6,7,8,9,10};
int[] arr2=new int[arr1.length];
for(int i=0;i<arr2.length;i++){
arr2[i]=arr1[i];
}
int j=3;
arr1=new int[arr2.length +1];
for (int i=0;i<arr2.length;i++){
	if (i<j){
		arr1[i]=arr2[i];
	}	
	else{
		arr1[i+1] = arr2[i];
}
}
Scanner sc = new Scanner(System.in);

System .out.println(Arrays.toString(arr1));
int a = sc.nextInt();
arr1[j]= a;

System .out.println(Arrays.toString(arr1));
}
}