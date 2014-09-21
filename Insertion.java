/** *************************************************
 * Insertion sort.
 *
 * Algorithmt takes element from unsorted portion of array,
 * then repeated scans and "inserts" that element in from of previous
 * element until it is in the correct place.
 *
 * ************************************************** */

class Insertion{
    public static void sort(Comparable[] a){
        int N = a.length;

        for( int i=1; i < N; ++ i ){
            for( int j=i; j > 0; --j ){
                //repeated "inserts" (swaps with) elmt in front of curr
                //elmt until it is "in order"
                if( less(a[j], a[j-1]) ) swap(a, j, j-1);
            }
        }
    }

    private static boolean less(Comparable x, Comparable y){
        return x.compareTo(y) < 0;
    }

    //we aren't doing any comparing, so we can just use any Objects
    //instead of Comparable objects.
    private static void swap(Object[] a, int i, int j){
        Object tmp = a[i];
        a[i]       = a[j];
        a[j]       = tmp;
    }

    //helper to print out array contents
    public static String toString(Comparable[] a){
        StringBuilder val = new StringBuilder();

        for(int i=0; i < a.length; ++i){
            val.append(a[i]);
            val.append(' ');
        }
        return val.toString();
    }

    //driver/tester
    public static void main(String args[]){
        int N = 15;

        Integer[] my_array = new Integer[N];

        //use worst case data: when input is in reverse sorted order
        for( int i=N; i > 0; --i){
            my_array[N-i] = i;
        }

        System.out.println("original:");
        System.out.println(toString(my_array));

        sort(my_array);

        System.out.println("sorted:");
        System.out.println(toString(my_array));
    
    }
}
