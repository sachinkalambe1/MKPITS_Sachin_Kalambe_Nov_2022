class pgamme{
public static void main(String[]args)
{
   int a[]={2,5,6,10,1};
   for(int i=0;i<a.length-1;i++)
   {
        if(a[i]>=a[i+1])
        {
             System.out.println(a[i]);
        }
   }
}