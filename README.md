A library of basic sorting algorithms written in Java.

#####Comparison based sorts - lower bounds (Big Omega)of n lg n runtime
```
* Selection sort - expected runtime always n^2 (every elmt is always touched/compared to every other elmt)
                 - 1 (constant) extra space
                 - not stable

* Insertion sort - expected runtime between n and n^2 (not every elmt is always touched)
                 - 1 (constant) extra space
                 - stable

* Merge sort - expected runtime (guaranteed) to be n lg n 
             - n (linear) extra space
             - stable

* Quick sort - expected runtime (probablistically, if shuffled/random input) n lg n. worst: n^2 , best: n lg n, avg: n lg n
             - lg n (log) extra space
             - not stable

* Quick3 sort - expected runtime between n and n lg n. worst: n^2, best: n, avg: n lg n
             - lg n (log) extra space
             - not stable

* Quick select 

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
a very good article on complexity analysis: http://stackoverflow.com/a/487278
