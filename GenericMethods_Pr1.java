import java.util.Random;

/**
 * Class: GenericMethodDemos2
 */
public class GenericMethods_Pr1
{
    public static void main(String[] args)
    {
        Random rand = new Random(888);

        // create arrays of Integer, Double, Character, and String
        Integer[] integerArray = {1, 2, 3, 4};
        Double[] doubleArray = {2.1, 22.2, 31.65, 10.5};
        Character[] characterArray = {'G', 'E', 'N', 'E', 'R','I','C','S'};
        String[] stringArray =  {"Lawrenceville", "Duluth", "Chicago", "New York", "Atlanta"} ;

        System.out.println("Array integerArray contains:");
        print(integerArray); // pass an Integer array
        swapEnds(integerArray);
        System.out.println("After swaping ends, array becomes:");
        print(integerArray);
        int randomIndex = (int) (rand.nextDouble() * integerArray.length);
        swap(integerArray, 0, randomIndex);
        System.out.println("After swaping start and index " + randomIndex + ", array becomes:");
        print(integerArray);
        System.out.println();

        System.out.println("Array doubleArray contains:");
        print(doubleArray); // pass a Double array
        swapEnds(doubleArray);
        System.out.println("After swaping ends, array becomes:");
        print(doubleArray);
        randomIndex = (int) (rand.nextDouble() * doubleArray.length);
        swap(doubleArray, 0, randomIndex);
        System.out.println("After swaping start and index " + randomIndex + ", array becomes:");
        print(doubleArray);
        System.out.println();

        System.out.println("Array characterrArray contains:");
        print(characterArray); // pass a Character array
        swapEnds(characterArray);
        System.out.println("After swaping ends, array becomes:");
        print(characterArray);
        randomIndex = (int) (rand.nextDouble()  * characterArray.length);
        swap(characterArray, 0, randomIndex);
        System.out.println("After swaping start and index " + randomIndex + ", array becomes:");
        print(characterArray);
        System.out.println();

        System.out.println("Array stringArray contains:");
        print(stringArray); // pass a Character array
        swapEnds(stringArray);
        System.out.println("After swaping ends, array becomes:");
        print(stringArray);
        randomIndex = (int) (rand.nextDouble()  * stringArray.length);
        swap(stringArray, 0, randomIndex);
        System.out.println("After swaping start and index " + randomIndex + ", array becomes:");
        print(stringArray);
        System.out.println();
    }

    /*
     * The method will print the given array of a generic type E.
     *
     * @param arr the given array.
     */
    //TODO 1: Define generic method print
    public static <E> void print(E[] arr) {
        for (E element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /*
     * The method will swap the first and last elements of the given array of a generic type E.
     *
     * @param arr the given array.
     */
    //TODO 2: Define generic method swapEnds
    public static <E> void swapEnds(E[] arr) {
        if (arr.length < 2) {
            return;
        }
        E temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
    }
    /*
     * The method will swap any two elements of the given array of a generic type E.
     *
     * @param arr the given array.
     * @param i the index of one element
     * @param j the index of the other element
     */
    //TODO 3: Define generic method define swap
    public static <E> void swap(E[] arr, int i, int j) {
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
