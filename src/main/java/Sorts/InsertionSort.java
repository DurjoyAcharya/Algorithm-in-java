package Sorts;

public class InsertionSort<T extends Comparable<T>>{
    private InsertionSort() {}//here private constructor directly object creation not possible use Junit with mockito
    public static <T extends Comparable<T>> T[] sort(T[] unsorted)
    {
        int length= unsorted.length;
        for (int i = 0; i < length; i++) {
            sort(i,unsorted);
        }
        return unsorted;
    }
    private static <T extends Comparable<T>> void sort(int index,T[] unsorted)
    {
        for (int j = index; j>0 ; j--) {
            T JE=unsorted[j]; //JE expressed as Jth element
            T JME=unsorted[j-1];//JME expressed as Jth minus one element
            if (JE.compareTo(JME)<0)
            {
                unsorted[j-1]=JE;
                unsorted[j]=JME;
            }
            else break;
        }
    }
}
