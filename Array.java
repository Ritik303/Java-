class Array{
public static void main(String[] args){
int[] array={11,23,44,2,3,5,67,89,2,43};
int ans=0;
int index=-1,i=0;
	while(i<array.length){
	if (array[i]>ans){
	ans=array[i];
	index=i;	
}
i++;	
}
System.out.println(ans+" at" +index);	
	
}
}