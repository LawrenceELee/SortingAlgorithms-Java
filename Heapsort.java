/** *************************************************
 * Heap sort.
 *
 * Use 1 as first idx as opposed to 0 as first. This is reflected
 * in sink, swap, less methods.
 *
 * ************************************************** */

class Heap{

    public static void sort(Comparable[] a){
        int N = a.length;

        for( int k = N/2; k >= 1; --k ){
            sink(a, k, N);
        }

        while( N > 1 ){
            swap(a, 1, N--);
            sink(a, 1, N);
        }
    }

    private static void sink(Comparable[] a, int k, int N){
        while(2*k <= N){
            int j = 2*k;
            if( j < N && less(a, j, j+1) )      j++;
            if(!less(a, k, j))                  break;

            swap(a, k, j);
            k = j;
        }
    }

    private static void swap(Comparable[] a, int i, int j){
        Comparable tmp = a[i-1];
        a[i-1]         = a[j-1];
        a[j-1]         = tmp;
    }

    private static boolean less(Comparable[] a, int i, int j){
        return a[i-1].compareTo(a[j-1]) < 0;
    }

    //driver/tester
    public static void main(String args[]){
        int N = 15;

        Integer[] my_array = new Integer[N];

        //use worst case input: reverse sorted order
        for( int i=N; i > 0; --i){
            my_array[N-i] = i;
        }

        System.out.println("original:");
        System.out.println(Helper.toString(my_array));

        sort(my_array);

        System.out.println("sorted:");
        System.out.println(Helper.toString(my_array));

        Helper.isSorted(my_array);
    }
}
