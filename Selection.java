/** *************************************************
 * Selection sort.
 *
 * It "selects" the min from all the items in the unsorted portion
 * of the array, and moves it to the last position of the sorted portion.
 *
 * ************************************************** */

class Selection{
    public static void sort(Comparable[] a){
        int N = a.length;

        for(int i=0; i < N; ++i){
            int min = i;
            for( int j=i+1; j < N; ++j){
                if(less(a[j], a[min]))  min = j;
            }
            swap(a, i, min);
        }
    }

    //helper function to compare Objects using their compareTo()
    private static boolean less(Comparable x, Comparable y){
        return x.compareTo(y) < 0;
    }

    //helper functin to swap 2 items in an array
    private static void swap(Object[] a, int i, int j){
        Object tmp  = a[i];
        a[i]        = a[j];
        a[j]        = tmp;
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
