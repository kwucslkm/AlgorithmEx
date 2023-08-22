package com.icia.sort;

public class BubleSort {

	public static void main(String[] args) {
		// 임의의 5개 숫자 배열을 만들고 그 배열을 오름차순으로  출력하시오.(버블정렬 알고리즘 사용)
//		int[] bSort = new int[5];
		int[] bSort = { 1, 8, 2, 155, 63,3, 12, 18, 33, 22, 99};
//		String[] bSort = {"가","나","다","라","마","바","사","아","자","차","카","타","파","하"};
		int temp;
		for (int i = bSort.length - 1; i < bSort.length; i--) {
			for (int j = 0; j < i; j++) {
				if (bSort[j] > bSort[j + 1]) {
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
