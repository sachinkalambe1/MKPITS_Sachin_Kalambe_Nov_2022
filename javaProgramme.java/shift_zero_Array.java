//write a java programme to shift all zero from given array in left direction in new array.

public class shift_zero_Array {
    public static void main(String[]args){
        int arr[]={1,2,0,2,0,3,3,4,5,6,0};
        int arr2[]=new int[arr.length];
        int count=0;
        for ( int i = 0; i < arr.length ; i++) {
            if(arr[i]==0){
                arr2[count]=arr[i];
                count++;

            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr2[count]=arr[i];
                count++;
            }
            System.out.println(arr2[i]);
        }
    }
}
