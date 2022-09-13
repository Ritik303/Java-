import java.util.Arrays;
public class Test2{
static int[] add(int value,int[] arr1){
int[] arr2 = new int[arr1.length+1];
	for(int i=0;i<arr1.length;i++){
	arr2[i]=arr1[i];
}
arr2[arr1.length]=value;
return arr2;
}
static double[] add(double value,double[] arr1){
double[] arr2 = new double[arr1.length+1];
	for(int i=0;i<arr1.length;i++){
	arr2[i]=arr1[i];

}
arr2[arr1.length]=value;
return arr2;
}
static void varArgs(int...x){
	//System.out.println("name :"+name);
	int[] y=x;
	System.out.println(Arrays.toString(x));


}
public static void main(String[] args){
System.out.println(Arrays.toString(add(20,new int[] {1,2,3,4,5,6})));3	
System.out.println(Arrays.toString(add(2.0,new double[] {1.2,3.4,5.6,7.8,9.9})));
//varArgs("23456",23,456);
varArgs(new int [] {12,34,54});
varArgs(12,34,557,78,87);
//function to add,delete,delete index


}
}