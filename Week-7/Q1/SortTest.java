class BubbleSort {
public void sort(int[] array) {
int n = array.length;
boolean swapped;
for (int i = 0; i < n - 1; i++) {
swapped = false;
for (int j = 0; j < n - i - 1; j++) {
if (array[j] > array[j + 1]) {
int temp = array[j];
array[j] = array[j + 1];
array[j + 1] = temp;
swapped = true;
}
}
if (!swapped) {
break;
}
}
}
}
class SelectionSort {
public void sort(int[] array) {
int n = array.length;
for (int i = 0; i < n - 1; i++) {
int minIndex = i;
for (int j = i + 1; j < n; j++) {
if (array[j] < array[minIndex]) {
minIndex = j;
}
}
if (minIndex != i) {
int temp = array[minIndex];
array[minIndex] = array[i];
array[i] = temp;
}
}
}
}
public class SortTest {
public static void bubbleSortTest(int[] array) {
BubbleSort bubbleSort = new BubbleSort();
int[] arrayCopy = array.clone();
System.out.println("Original Array (Bubble Sort): " +
java.util.Arrays.toString(arrayCopy));
bubbleSort.sort(arrayCopy);
System.out.println("Sorted Array (Bubble Sort): " +
java.util.Arrays.toString(arrayCopy));
}
public static void selectionSortTest(int[] array) {
SelectionSort selectionSort = new SelectionSort();
int[] arrayCopy = array.clone();
System.out.println("Original Array (Selection Sort): " +
java.util.Arrays.toString(arrayCopy));
selectionSort.sort(arrayCopy);
System.out.println("Sorted Array (Selection Sort): " +
java.util.Arrays.toString(arrayCopy));
}
public static void main(String[] args) {
int[] sampleArray = {64, 34, 25, 12, 22, 11, 90};
System.out.println("Testing Bubble Sort:");
bubbleSortTest(sampleArray);
System.out.println();
System.out.println("Testing Selection Sort:");
selectionSortTest(sampleArray);}}