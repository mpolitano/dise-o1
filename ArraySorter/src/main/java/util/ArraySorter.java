package util;

/**
 * Sorts arrays of comparable objects using a variety of options.
 * 
 * @author aguirre
 *
 * @param <E> is the type of the elements of the array.
 */
public class ArraySorter<E extends Comparable<E>> {

	/**
	 * The array to sort.
	 */
	private E[] array;
	
	/**
	 * The algorithm to use for sorting.
	 */
	private SortAlgorithm algorithm = SortAlgorithm.SELECTIONSORT;

	/**
	 * Default constructor. Sets the array to sort and sorting algorithm to INSERTION SORT.
	 * @param array is the array to sort.
	 */
	public ArraySorter(E[] array) {
		if (array == null) throw new IllegalArgumentException("array must be non-null");
		this.array = array;
	}

	/**
	 * Constructor that sets array and sorting algorithm.
	 * @param array is the array to sort.
	 * @param algorithm is the algorithm to use for sorting.
	 */
	public ArraySorter(E[] array, SortAlgorithm algorithm) {
		if (array == null) throw new IllegalArgumentException("array must be non-null");
		this.array = array;
		this.algorithm = algorithm;
	}

	/**
	 * Sets the algorithm to use for sorting.
	 * @param algorithm is the algorithm to set for sorting.
	 */
	public void setAlgorithm(SortAlgorithm algorithm) {
		if (algorithm == null) throw new IllegalArgumentException("algorithm can't be null");
		this.algorithm = algorithm;
	}
	
	/**
	 * Retrieves the (sorted or yet unsorted) array within the ArraySorter.
	 * @return the array stored within the ArraySorter object.
	 */
	public E[] getArray() {
		return this.array;
	}

	/**
	 * Sets the array to be sorted.
	 * @param array is the new array to sort.
	 */
	public void setArray(E[] array) {
		throw new UnsupportedOperationException("method not yet implemented");		
	}

	/**
	 * Sorts the array.
	 * The array can then be retrieved using getArray() method.
	 */
	public void sort() {
		switch (this.algorithm) {
		case INSERTIONSORT: 	
			insertionSort(array); 
			break;
		case BUBBLESORT:
			bubbleSort(array); 
			break;
		case MERGESORT:
			mergeSort(array); 
			break;
		case SELECTIONSORT:
			selectionSort(array); 
			break;
		default:
            throw new UnsupportedOperationException("sorting method not yet implemented"); 
		}	
	}

	/**
	 * Sorts an array. Implements the insertion sort algorithm.
	 * @param <T> is the type of the elements in the array.
	 * @param array is the array to be sorted.
	 */
	private static <T extends Comparable<T>> void insertionSort(T[] array) {
		if (array == null) throw new IllegalArgumentException("array is null, can't sort");
		for ( int unsorted = 1; unsorted < array.length; unsorted++){
			T key = array[unsorted];
			int loc = unsorted-1;
			while ((loc >= 0) && (array[loc].compareTo(key) > 0)){
				array[loc+1] = array[loc];
				loc--;
			}
			array[loc+1] = key ;
		}
	}

	/**
	 * Sorts an array. Implements the selection sort algorithm.
	 * @param <T> is the type of the elements in the array.
	 * @param array is the array to be sorted.
	 */
	private static <T extends Comparable<T>> void selectionSort(T[] array) {
		throw new UnsupportedOperationException("method not yet implemented");					
	}

	/**
	 * Sorts an array. Implements the mergesort sort algorithm.
	 * @param <T> is the type of the elements in the array.
	 * @param array is the array to be sorted.
	 */
	private static <T extends Comparable<T>> void mergeSort(T[] array) {
		throw new UnsupportedOperationException("method not yet implemented");				
	}

	/**
	 * Sorts an array. Implements the bubblesort sort algorithm.
	 * @param <T> is the type of the elements in the array.
	 * @param array is the array to be sorted.
	 */
	private static <T extends Comparable<T>> void bubbleSort(T[] array) {
		throw new UnsupportedOperationException("method not yet implemented");				
	}

	/**
	 * Checks if a given array is sorted.
	 * @param <T> is the type of the elements in the array.
	 * @param array is the array to be checked for sortedness.
	 * @return true iff the array is sorted.
	 */
	public static <T extends Comparable<T>> boolean isSorted(T[] array) {
		throw new UnsupportedOperationException("method not yet implemented");		
	}

}
