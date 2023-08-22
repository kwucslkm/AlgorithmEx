package com.icia.LoopEx;

public class BubbleSort {

	public static void main(String[] args) {
		//
		int bSort[] = { 5, 4, 1, 3, 2 };
		int temp;
		for (int i = 0; i < bSort.length - 1; i++) {
			for (int j = 0; j < bSort.length - 1 - i; j++) {
				if (bSort[j] > bSort[j + 1]) {
					temp = bSort[j];
					bSort[j] = bSort[j + 1];
					bSort[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < bSort.length; i++)
			System.out.print(bSort[i]+" ");

		System.out.println();

		for (int i = bSort.length - 1; i < bSort.length; i--) {
			for (int j = 0; j < i; j++) {
				if (bSort[j] < bSort[j + 1]) {
					temp = bSort[j];
					bSort[j] = bSort[j + 1];
					bSort[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < bSort.length; i++)
			System.out.println(bSort[i]);
	}
}
