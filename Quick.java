/** *************************************************
 * Quick sort.
 *
 * Top-down recurive quicksort (does a bottom up quicksort exist?).
 * Most efficient running time is if input is unique (few duplicates) and
 * in random order (as opposed to reverse sorted order).
 *
 * Quick3 (quicksort 3 way partition) works better when many duplicates
 * in input.
 *
 * runtime: O(n lg n)
 * extra space: O(lg n) (for recursive call stack)
 * http://cs.stackexchange.com/q/22516
 *
 * This implementation is considered in-place (not counting the recursive
 * call stack memory) becuase it doesn't use an extra auxilary buffer like
 * Merge.java. It sorts the elements within the array with at most a 
 * constant amount of them outside the array at any given time.
 * http://stackoverflow.com/a/22028232
 *
 * ************************************************** */

class Quick{
    public static void sort(Comparable[] a){
        //need to randomize input to have probabilistic guarantee of
        //O(n lg n) run time.

        Helper.shuffle(a);
        sort(a, 0, a.length-1);
    }

    private static void sort(Comparable[] a, int lo, int hi){
        if( hi <= lo )  return;  //base case

        int j = partition(a, lo, hi); //find pivot

        sort(a, lo, j-1);  //sort around pivot
        sort(a, j+1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi){
        int i=lo, j=hi+1;

        while(true){
            //scan from left
            while( Helper.less(a[++i], a[lo]) ){
                if( i == hi )   break; //right bounds error check
            }
            //scan from right
            while( Helper.less(a[lo], a[--j]) ){
                if( j == lo )   break; //left bounds error check
            }

            if( i >= j ) break;  //bound check
            Helper.swap(a, i, j);
        }
        Helper.swap(a, j, lo); //put pivot elmt in the right index
        return j; //return index of pivot
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
