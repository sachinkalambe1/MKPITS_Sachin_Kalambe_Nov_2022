class Array{

void Arr()
{

int a[]={1,2,3,4};

for(int i=0;i<=3;i++)
{
System.out.println(a[i]);
}

for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
	}

for(int v:a){
	System.out.println("For Each :"+v);
	}
	int a1[];
	 a1=a;
	for(int v:a1){
		System.out.println("For Each :"+v);
	}
}
}
class ArrayDemo2{
public static void main(String[]args) {
Array s2=new Array();
s2.Arr();
}
}