public class Array_Contains_Specific_Value {

    public static void main(String[] args) {

        int[] array = {321, 654, 987, 789, 456, 123};

        int toFind = 179;

        boolean found = false;

        for (int n : array) {

            if (n == toFind) {

                found = true;

                break;
            }

        }

        if (found)

        System.out.println(toFind + " is found");

         else

        System.out.println(toFind + " is not found ");


    }
}