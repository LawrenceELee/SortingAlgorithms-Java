/** *************************************************
 * Quick sort.
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
                if( i == hi )   break; //bounds error check
            }
            //scan from right
            while( Helper.less(a[lo], a[--j]) ){
                if( j == lo )   break;
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
