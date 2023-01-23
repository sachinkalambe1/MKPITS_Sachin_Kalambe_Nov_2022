class Array{

void Arr(){
 int a[][]={{1,2,3,4},{5,6,7,8,9,10}};
  /*for(int i=0;i<=1;i++)
  {
  for(int j=0;j<=2;j++)
  {
  System.out.println(a[i][j]);
  }

  }

for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a[i].length;j++)
	{
		System.out.println(a[i][j]);

		}

	}*/

for(int[] sk: a)
{
	for(int x: sk)
	{
		System.out.println(" For Each" +x);
		}
	}

}
}
class ArrayDemo3{
public static void main(String[] args)
{
Array s1=new Array();
s1.Arr();
}
}













































































