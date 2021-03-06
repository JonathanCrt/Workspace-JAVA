package tp3_mlv;

import java.util.Arrays;


public class Sort {
	
	/**
	 * Swap two variable into table
	 * @param array
	 * @param index1
	 * @param index2
	 * @return array
	 */
	public static int[] swap(int[] array, int index1, int index2) {
		
		int i;
		int tmp = 0;
		
		for(i=1; i <array.length; i++) {
			
			
			tmp = array[index1];
			array[index1] = array[index2];
			array[index2] = tmp;
		
		}
		
		return array;
	}
	
	/**
	 * Return index of the min (array)
	 * @param array
	 * @return minIndex
	 */
	public static int indexOfMin(int[] array) {
		
		
		/* Solution 1 :  with one primitive array + loop  for() */
		
		
		int minValue = array[0];
		int minIndex = 0;
		
		int index = 0;
		for(index =0; index <array.length; index++) {
			if(array[index] < minValue) {
				minValue = array[index];
				minIndex = index;
			}
		}
		return minIndex;
		
		/* Solution 2 :  with one primitive array + JAVA 8 Stream API */
		/* 
		int min = Arrays.stream(array).min().getAsInt();		
		
		int index = Arrays.stream(array)
				.boxed()
				.collect(Collectors.toList())
				.indexOf(min);
		
		return index;
		*/
	}
	
	
	/**
	 * Return the index of the min (array) between two index
	 * @param array
	 * @param index1
	 * @param index2
	 * @return minIndex
	 */
	public static  int indexOfMinInterval(int[] array, int index1, int index2) {
		
		int minValue = array[0];
		int minIndex = 0;
		
		int sizeOfInterval = index2 - index1;
		
		int i;
		for(i = 0; i <  sizeOfInterval; i++) {
			if(array[i] < minValue) {
				minValue = array[i];
				minIndex = i;
			}
			
		}
		
		return minIndex;
	}
	
	/**
	 * sort an array
	 * @param array
	 * @return
	 */
	public static int[] sort (int[] array) {
		
		int index;
		int minIdx;
		
		
		for(index=0; index<array.length; index++){
			minIdx = indexOfMinInterval(array,  index, array.length);
			
			if(array[index] != array[minIdx]) {
				
				swap(array, index, minIdx);
				System.out.println("pass!");
			}
			
		}
		
		return array;
		
	}
	
	
	public static void main(String[] args) {
		
		int tab[] = {7, 3, 2, 1, 0, 15};
				/*   0  1  2  3   4  5  */ 
		
		
		System.out.println("Array initialisation : " + Arrays.toString(tab));
		
		System.out.println("After swap at index 0 and 5 : " + Arrays.toString(swap(tab, 0, 5)));
		System.out.println("After swap at index 1 and 2 : " + Arrays.toString(swap(tab, 1, 2)));
		
		
		System.out.println("length of array : " + tab.length);
		System.out.println("index of minimum: " + indexOfMin(tab) );
		System.out.println("index of minimum (with interval): " + indexOfMinInterval(tab, 0, 3) );
		
		
		System.out.println(Arrays.toString(sort(tab)));
	
	}
}
