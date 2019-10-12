# IndexMapping  - Trivial Hashing

Given a limited range array contains both positive and non-positive numbers, i.e., elements are in the range from -MAX to +MAX. Our task is to search if some number is present in the array or not in O(1) time.

Since range is limited, we can use index mapping (or trivial hashing). We use values as the index in a big array. Therefore we can search and insert elements in O(1) time.

### Output
```
0 -> 0[ ] 1[ ] 2[ ] 3[ ] 4[ ] 5[ ] 6[ ] 7[ ] 8[ ] 9[ ] 
1 -> 0[ ] 1[ ] 2[ ] 3[ ] 4[ ] 5[ ] 6[ ] 7[ ] 8[ ] 9[ ] 

################## Print myArray[][] ##################
0 -> 0[X] 1[ ] 2[X] 3[ ] 4[X] 5[ ] 6[X] 7[ ] 8[X] 9[ ] 
1 -> 0[ ] 1[X] 2[ ] 3[X] 4[ ] 5[X] 6[ ] 7[X] 8[ ] 9[X] 

################## Print myArray[][] ##################
0 -> 0[X] 1[X] 2[X] 3[ ] 4[X] 5[ ] 6[X] 7[ ] 8[X] 9[ ] 
1 -> 0[ ] 1[X] 2[ ] 3[X] 4[ ] 5[X] 6[ ] 7[X] 8[ ] 9[X] 

2 is  contained in myArray
-4 is Not contained in myArray
```

Reference: https://www.geeksforgeeks.org/index-mapping-or-trivial-hashing-with-negatives-allowed/
