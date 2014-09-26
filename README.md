A library of basic sorting algorithms written in Java.

#####Comparison based sorts - lower bounds (Big Omega) of n lg n runtime
```
* Selection sort - expected runtime always n^2 (every elmt is always touched/compared to every other elmt)
                 - 1 (constant) extra space
                 - not stable
                 - no reason to use this sort in practice.

* Insertion sort - expected runtime between n and n^2 (not every elmt is always touched)
                 - 1 (constant) extra space
                 - stable
                 - use when input is in mostly sorted order (most of array is sorted, except for a few elmts).
                 - use when stability is a concern


* Merge sort - expected runtime (guaranteed) to be n lg n 
             - n (linear) extra space
             - stable
             - use this when stability is important and space is not a concern.

* Quick sort - expected runtime (probablistically, if shuffled/random input) n lg n. worst: n^2 , best: n lg n, avg: n lg n
             - lg n (log) extra space
             - not stable
             - fastest, general purpose (as opposed to radix which requires a certain type of input) sorting alg.

* Quick3 sort - expected runtime between n and n lg n. worst: n^2, best: n, avg: n lg n
             - lg n (log) extra space
             - not stable
             - use this over Quick when a lot of duplicates in input

* Quick select - used to find kth smallest (elmt of a sorted array) in an unsorted array in linear time. To motivate why runtime is linear, suppose partition divides the array exactly in half every time. Then there will be N + N/2 + N/4 + N/8 + ... num of compares, terminating when kth smallest item is found. The previous sum is less than 2N.

* Heap sort - expected runtime O(n lg n).
            - O(1) extra space.
            - not stable
```

#####Non comparison based sorts - lower bound n runtime
```
* Counting sort
* Radix sort (least significant digit first, most significant digit first)
* Bucket sort
```


```
* Topological sort
```


Notes:
a very good article on explaining complexity analysis in planin English: http://stackoverflow.com/a/487278
