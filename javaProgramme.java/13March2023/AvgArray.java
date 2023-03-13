//Write a java programe to calculate average of integer array.

class AvgArray{
public static void main(String[]args){
	int avg=0,sum=0;
int a[]={1,2,3,4,5};
int b=a.length;
for(int i=0;i<a.length;i++){
sum=sum+a[i];
avg=sum/b;
	}
	System.out.println(avg);
}
}