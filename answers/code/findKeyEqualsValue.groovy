/**
 * Find an element whose value equals its index in O(log n) where n is
 * the length of the array.
 *
 * @param ints a sorted array of distinct integers
 * @return the index of an element whose value equals its index or -1
 * if no such element exists.
 * @author Hendrik Werner
 * @author Constantin Blach
 */
int findKeyEqualsValue(int[] ints) {
    if (ints.length == 0) {
        return -1
    } else if (ints.length == 1) {
        return 0 == ints[0] ? 0 : -1
    }
    int middle = ints.length.intdiv 2
    if (middle == ints[middle]) {
        return middle
    }
    int[] left = new int[middle]
    int[] right = new int[ints.length - middle]
    System.arraycopy ints, 0, left, 0, middle
    System.arraycopy ints, middle, right, 0, ints.length - middle
    int leftIndex = findKeyEqualsValue left
    if (leftIndex >= 0) {
        return leftIndex
    }
    findKeyEqualsValue right
}
