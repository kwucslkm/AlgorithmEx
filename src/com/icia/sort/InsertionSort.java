package com.icia.sort;

public class InsertionSort {
	public static void main(String[] args) {
		int[] iSort = { 1, 8, 2, 155, 63, 3, 12, 18, 33, 22 };
		int temp;
		for (int i = 0; i < iSort.length - 1; i++) {
			for (int j = 0; j <= i; j++) {
				if (iSort[j] > iSort[i + 1]) {
					temp = iSort[j];
					iSort[j] = iSort[i + 1];
					iSort[i + 1] = temp;
				}
			}
		}
		for (int i = 0; i < iSort.length; i++) {
			System.out.print(iSort[i] + " ");
		}
		System.out.println();
	}
}
