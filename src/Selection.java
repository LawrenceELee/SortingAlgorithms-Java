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
                if(Helper.less(a[j], a[min]))   min = j;
            }
            Helper.swap(a, i, min);
        }
    }

    //driver/tester
    public static void main(String args[]){
        int N = 15;

        Integer[] my_array = new Integer[N];

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
