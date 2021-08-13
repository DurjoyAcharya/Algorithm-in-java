package Sorts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

class InsertionSortTest {
    private static final Random RANDOM = new Random();
    private static final int SIZE = 10000;
    private static Integer[] unsorted = null;
    private static String[] arr=new String[]{"joy","tiger","apple","pilot","Durjoy","\nAcharya"};
    static {
        unsorted = new Integer[SIZE];
        int i = 0;
        while (i < unsorted.length) {
            int j = RANDOM.nextInt(unsorted.length * 10);
            unsorted[i++] = j;
        }

    }
    @Test
    void sort() {
        Integer[] result = InsertionSort.sort(unsorted.clone());
        Arrays.stream(result).forEach(e-> {
            System.out.print(e+" ");
        });
    }
    @Test
    void StringTest()
    {
        String[] res=InsertionSort.sort(arr);
        Arrays.stream(res).forEach(System.out::println);
    }
}