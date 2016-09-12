/**
 * Check whether an array contains an element whose value equals its
 * index in O(log n) where n is the length of the array.
 *
 * @param a the array
 * @param from where to begin searching
 * @param to where to stop searching
 * @return whether a contains an elements whose value equals its index
 * in the specified range
 */
boolean containsKeyEqualsValue(int[] a, int from, int to) {
    if (from == to) {
        return false
    }
    int middle = (from + to) / 2
    if (middle == a[middle]) {
        return true
    } else if (middle < a[middle]) {
        return containsKeyEqualsValue(a, from, middle)
    } else {
        return containsKeyEqualsValue(a, middle + 1, to)
    }
}

int[] a = [-3, -3, 3, 7, 10, 12]

println containsKeyEqualsValue(a, 0, a.length)
