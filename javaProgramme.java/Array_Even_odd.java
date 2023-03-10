//Write a java programme to set even number after that odd in one array from given array.

public class Array_Even_odd {
    public static void main(String[]args){
        int c=0;
     int arr[]={1,2,3,4,5,6,7,8,9,10};
      int arr2[]= new int[arr.length];
     for(int i=0;i< arr.length;i++){
         if(arr[i]%2==0){
             arr2[c]=arr[i];
             c++;
         }
     }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 !=0){
                arr2[c]=arr[i];
                c++;
            }
            System.out.println(arr2[i]);
        }

    }
}
