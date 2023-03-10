//write a java programme to shift element by 2 index in left direction and return new array.

public class shift_array_2index {
    public static void main(String[]args){
        int arr[]={1,2,3,4,5,6};
        int arr2[]=new int[arr.length];
        int a=arr[0];
        int b=arr[1];
        int count=0;
        for (int i = 2; i < arr.length; i++) {
            arr2[count]=arr[i];
            count++;
        }
        arr2[count]=a;
        arr2[count+1]=b;
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
