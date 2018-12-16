/**
 * 
 */
package com.algorithms.CLRS.Sorting;

/**
 * @author Venkat
 * 
 */
public class InsertionSort implements Sortable {
	int key;
	int previousPos;

	@Override
	public int[] sort(int[] arrayToBeSorted) {
		for (int currentPos = 1 ; currentPos < arrayToBeSorted.length; currentPos++) {
			key = arrayToBeSorted[currentPos];
			previousPos = currentPos - 1;
			
			while(previousPos >= 0 && arrayToBeSorted[previousPos] > key){
				
				arrayToBeSorted[previousPos+1] = arrayToBeSorted[previousPos] ;
				previousPos = previousPos - 1 ;
			}
			arrayToBeSorted[previousPos+1] = key ;
		}
		return arrayToBeSorted;
	}

}
