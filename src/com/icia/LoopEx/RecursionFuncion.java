package com.icia.LoopEx;

public class RecursionFuncion {
//	static int i = 0;
	static int sum = 0;

	public static void main(String[] args) {
		System.out.printf("%d",recursionMethod(100));
	}

	static int recursionMethod(int num) {
		int i = num;
		if (i == 2) {
			return sum + 2;
		}
		sum = sum + i;
		return recursionMethod(i - 2);
	}
}

//int sum = 0;
//for (int i = 0; i < 100; i++) {
//	sum = sum + i + 1;
//}
//System.out.println(sum);