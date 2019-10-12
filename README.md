# IndexMapping
## Reference: https://www.geeksforgeeks.org/index-mapping-or-trivial-hashing-with-negatives-allowed/

Given a limited range array contains both positive and non-positive numbers, i.e., elements are in the range from -MAX to +MAX. Our task is to search if some number is present in the array or not in O(1) time.

Since range is limited, we can use index mapping (or trivial hashing). We use values as the index in a big array. Therefore we can search and insert elements in O(1) time.
