/** *************************************************
 * Quicksort 3 way partition.
 *
 * Better running time than regular Quicksort when input has
 * mulitple duplicates (not unique input).
 *
 * ************************************************** */

class Quick3{
    public static void sort(Comparable[] a){
        Helper.shuffle(a);

        sort(a, 0, a.length-1);
    }

    private static void sort(Comparable[] a, int lo, int hi){
        if( hi <= lo )  return;     //base case

        int lt=lo, gt=hi;
        Comparable v = a[lo];
        int i=lo+1;

        while( i <= gt ){
            int cmp = a[i].compareTo(v);

            if      (cmp < 0)   Helper.swap(a, i++, lt++); 
            //curr elmt less than pivot, swap with lt idx and increment
            //both ptrs
            else if (cmp > 0)   Helper.swap(a, i, gt--);
            //curr elmt greater than pivot, swap with gt idx and decrement
            //gt pointer
            else                i++;
            //curr elmt is equal (duplicate) to pivot, increment curr idx
        }

        sort(a, lo, lt-1); //swap around pivots if duplicate
        sort(a, gt+1, hi);
    }

    //driver/tester
    public static void main(String args[]){
        int N = 15;

        Integer[] my_array = new Integer[N];

        //use worst case input: reverse sorted order with 3 dups of each
        for( int i=N/3; i > 0; --i){
            //to get 3 duplicates of each number
            my_array[N-(i*3-0)] = i;
            my_array[N-(i*3-1)] = i;
            my_array[N-(i*3-2)] = i;
        }

        System.out.println("original:");
        System.out.println(Helper.toString(my_array));

        sort(my_array);

        System.out.println("sorted:");
        System.out.println(Helper.toString(my_array));
    }
}
