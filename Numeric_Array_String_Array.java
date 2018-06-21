import java.util.Arrays;

public class Numeric_Array_String_Array {

    public static void main(String[] args) {

        int [] my_array = { 12,45,65,121,63,98,78,45,66,77,88,22,11,44,55};

        String[] my_array1 = {"Rahul", "Jag", "Vips"," Gami", "Rajni"," Meghna"," Nikita", "Payal", "Dana", "Rakesh", "Nurali", "Roma "};

        System.out.println("Original Numeric Array" + Arrays.toString(my_array)+"\n");

        Arrays.sort(my_array);

        System.out.println("Sorted Numeric Array" + Arrays.toString(my_array)+"\n");



        System.out.println( "Original String Names" + Arrays.toString(my_array1)+"\n");

        Arrays.sort(my_array1);

        System.out.println("Sorted String Names " + Arrays.toString(my_array1)+"\n");



    }
}
