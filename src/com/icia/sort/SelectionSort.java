package com.icia.sort;

public class SelectionSort {

	public static void main(String[] args) {
		// selection sort 알고리즘을 이용하여 오름차순으로 정렬하시오.
		int[] sSort = { 1, 8, 2, 155, 63, 3, 12, 18, 33, 22, 99 };
		int temp;

		for (int i = 0; i < sSort.length; i++) {
			for (int j = i + 1; j < sSort.length; j++) {
				if (sSort[i] > sSort[j]) {
					temp = sSort[i];
					sSort[i] = sSort[j];
					sSort[j] = temp;
				}
			}
		}
		for (int i = 0; i < sSort.length; i++)
			System.out.println(sSort[i]);
	}

}
