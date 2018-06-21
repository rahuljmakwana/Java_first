import java.util.Arrays;

public class Insert_Element_into_Array {

    public static void main(String[] args) {

        int [] array =  {0,1,2,3,4,5,6,7,8,9,10,11,12,14,15};

        int index_position = 13; //number of the position.


        int value = 13; // new addition value

        System.out.println( " Original Array :" + Arrays.toString(array)+"\n");


        for (int i = array.length-1; i > index_position; i--) {

            array [i]  = array [ i-1];

        }

         array [index_position] =  value;

        System.out.println(" New array : " + Arrays.toString(array));



    }





}