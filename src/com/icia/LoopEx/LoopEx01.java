package com.icia.LoopEx;

public class LoopEx01 {

	public static void main(String[] args) {
		// ex02
		// 0부터 100이하까지 의 합을 출력하시오.
		// 0부터 100이하까지 짝수의 합을 출력하시오.
		// 0투터 100이하까지 홀수의 합을 출력하시오.
		// 0부터 100이하까지 3의 배수의 합을 출력하시오.
		// 0부터 100이하까지 5의 배수의 합을 출력하시오.

		int iSum = 0;
		int jSum = 0;
		int kSum = 0;
		int lSum = 0;
		int mSum = 0;

		for (int i = 0; i <= 100; i++) {// i++;
			iSum = iSum + i; // iSum += i;

			if (i % 2 == 0) {
				jSum += i;
			}
			if (i % 2 == 1) {
				kSum += i;
			}
			if (i % 3 == 0) {
				lSum += i;
			}
			if (i % 5 == 0) {
				mSum += i;
			}
		}
		System.out.println("0부터100이하까지의 합은 > " + iSum);
		System.out.println("0부터100이하까지의 짝수의 합은 > " + jSum);
		System.out.println("0부터100이하까지의 홀수의 합은 > " + kSum);
		System.out.println("0부터100이하까지의 3의배수의 합은 > " + lSum);
		System.out.println("0부터100이하까지의 5의배수의 합은 > " + mSum);
	}

}
//int i = 0;
//int j = 0;
//int k = 0;
//int l = 0;
//int m = 0;
//int iSum = 0;
//int jSum = 0;
//int kSum = 0;
//int lSum = 0;
//int mSum = 0;
//
//while (i <= 100) {
//	iSum = iSum + i; // iSum += i;
//
//	if (i % 2 == 0) {
//		jSum += i;
//	}
//	if (i % 2 == 1) {
//		kSum += i;
//	}
//	if (i % 3 == 0) {
//		lSum += i;
//	}
//	if (i % 5 == 0) {
//		mSum += i;
//	}
//	
//	i++;
//}