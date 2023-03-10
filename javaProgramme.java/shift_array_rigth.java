//write a java programme to shift an element of an array to right direction and display in new array.

public class shift_array_rigth {
    public static void main(String[]args){
        int arr[]={1,2,3,4,5,6};
        int arr2[]=new int[arr.length];
        int count=0;
        int a=arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr2[count]=arr[i];
            count++;
          //  System.out.println(arr[count]);
        }
       arr2[count]=a;
        for (int i = 0; i < arr2.length ; i++) {
            System.out.println(arr2[i]);
        }
        //System.out.println(arr2[count]);

    }
}
