/** *************************************************
 * Merge sort.
 *
 * Top-down recursive merge sort.
 *
 * Recursively divided unsorted array in half, until array length is 1.
 * Then compare between elements merging the smaller of the elmts to the
 * larger sorted array. Repeat with sorted arrays of length 2, etc.
 *
 *************************************************** */

class Merge{

    public static void sort(Comparable[] a){
        Comparable[] aux = new Comparable[a.length]; 
        //tmp buffer to hold copy of array. 
        //Instantiate in function call instead of object instance var
        //b/c of multiple sorts running we will have multiple buffers
        //instead of just 1, which might cause race conditon problems.

        sort(a, aux, 0, a.length-1);
    }

    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi){
        if( hi <= lo )  return; //base case

        int mid = (lo + hi)/2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid+1, hi);
        merge(a, aux, lo, mid, hi);
    }

    private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi){
        //set starting points
        int i=lo, j=mid+1;

        //copy all elmts to tmp buffer
        for( int k = lo; k <= hi; ++k ){
            aux[k] = a[k];
        }

        //copy the next smallest elmt to the end of sorted portion
        for( int k = lo; k <= hi; ++k ){
            if     ( i > mid )                      a[k] = aux[j++];
            else if( j > hi )                       a[k] = aux[i++];
            else if( Helper.less(aux[j], aux[i]) )  a[k] = aux[j++];
            else                                    a[k] = aux[i++];
        }
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
    }
}
