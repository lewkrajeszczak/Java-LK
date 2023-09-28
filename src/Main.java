import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0 && i % 3 == 0 )
            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
                System.out.println("i = " + i);
        }

        //ZADANIE 1
        int[] arrayOfInts = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int index = 0;
        while (index < arrayOfInts.length){
            System.out.println(index);
            index++;
        }

        //ZADANIE 2
        int[] array = new int[12];
        array[0] = 1;
        array[1] = 1;
        index = 2;
        while (index < array.length){
            array[index] = array[index - 1] + array[index - 2];
            index++;
        }
        System.out.println(Arrays.toString(array));

        //ZADANIE 3
        int i = 0;
        double[] arrayDouble = new double[10];
        while (i < arrayDouble.length){
            arrayDouble[i] = Math.random() * 10;
            i++;
        }
        Arrays.sort(arrayDouble);
        System.out.println(Arrays.toString(arrayDouble));

        //ZADANIE 4
        String imie = "Antoni Jezak Jawornik";
        String[] strings = imie.split("");
        for (int j = 0; j < strings.length; j++) {
            System.out.println(strings[j]);
        }

        //ZADANIE 5
        boolean[] arrayBoolean = new boolean[10];
        for(int y = 0; y < arrayBoolean.length; y++){
            arrayBoolean[y] = Math.random() > 0.5;
        }

        System.out.println(Arrays.toString(arrayBoolean));
    }
}
