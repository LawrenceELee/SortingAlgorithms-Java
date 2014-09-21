/** *************************************************
 * Library of helper functions for sorting algorithms.
 *
 * Put in its own library to avoid multiple copies.
 *
 * Don't have to import in other .java files if in default package
 * (same directory as other .java files and no 'public' 'private').
 *
 * ************************************************** */

class Helper{
    //helper function to compare Objects using their compareTo()
    static boolean less(Comparable x, Comparable y){
        return x.compareTo(y) < 0;
    }

    //we aren't doing any comparing, so we can just use any Objects
    //instead of Comparable objects.
    //helper functin to swap 2 items in an array
    static void swap(Object[] a, int i, int j){
        Object tmp = a[i];
        a[i]       = a[j];
        a[j]       = tmp;
    }

    //helper to print out array contents
    static String toString(Comparable[] a){
        StringBuilder val = new StringBuilder();

        for(int i=0; i < a.length; ++i){
            val.append(a[i]);
            val.append(' ');
        }
        return val.toString();
    }
}
