List mergesort(List inlist) {
if (inlist.length() <= 1) return inlist;
List l1 = half of the items from inlist;
List l2 = other half of items from inlist;
return merge(mergesort(l1), mergesort(l2));
}Sorting 12-17
Mergesort Implementation
static <E extends Comparable<E>>
void mergesort(E[] A, E[] temp, int l, int r) {
int mid = (l + r) / 2; // Select midpoint
if (l == r)
return; // List has one element
mergesort(A, temp, l, mid); // sort first half
mergesort(A, temp, mid + 1, r); // sort second half
for (int i = l; i <= r; i++)
// Copy subarray to temp
temp[i] = A[i];Sorting 12-18
// Do the merge operation back to A
int i1 = l;
int i2 = mid + 1;
for (int curr = l; curr <= r; curr++) {
if (i1 == mid + 1) // Left sublist exhausted
A[curr] = temp[i2++];
else if (i2 > r) // Right sublist exhausted
A[curr] = temp[i1++];
else if (temp[i1].compareTo(temp[i2]) < 0)//Get smaller
A[curr] = temp[i1++];
else
A[curr] = temp[i2++];
}
}Sorting 12-19
Mergesort cost:  (n lg n).
Mergsort is also good for sorting linke 