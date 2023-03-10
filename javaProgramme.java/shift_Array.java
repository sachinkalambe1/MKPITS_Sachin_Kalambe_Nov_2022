//write a java programme to shift an element in left direction and return new array.

public class shift_Array {
    public static void main(String[]args){
        int arr[]={1,3,5,7,9};
        int arr2[]=new int[arr.length];
        int a=arr[0];
        int count=0;
        for(int i=1;i< arr.length;i++){
            arr2[count]=arr[i];
            count++;
        }
        arr2[count]=a;
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }
}
