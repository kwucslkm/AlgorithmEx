package com.icia.LoopEx;

public class FuncLoop01 {

	public static void main(String[] args) {
		int bSort[] = { 5, 4, 1, 3, 2 };
		swap(bSort);
		for (int i = 0; i < bSort.length; i++)
			System.out.print(bSort[i] + " ");
		System.out.println();
		for (int i = bSort.length; i > 0; i--)
			System.out.println(bSort[i - 1]);
	}

	static void swap(int[] bSort) {
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
	}
}
