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
                if( Helper.less(a[j], a[j-1]) ) Helper.swap(a, j, j-1);
            }
        }
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
        System.out.println(Helper.toString(my_array));

        sort(my_array);

        System.out.println("sorted:");
        System.out.println(Helper.toString(my_array));

        assert Helper.isSorted(my_array);
    }
}
