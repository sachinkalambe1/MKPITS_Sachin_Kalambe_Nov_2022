//Check whether the sequence of numbers 1, 2, 3 appears in a given array of integers somewhere
public class check_array_sequence {

    public static void main(String[] args) {
 int arr[]={1,2,3,4,5};

        for (int i = 0; i < arr.length; i++) {

            if(arr[0]==1 && arr[1]==2 && arr[2]==3){
                System.out.println("in sequence"+arr[i]);
            }


        }

    }
}