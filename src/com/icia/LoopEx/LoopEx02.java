package com.icia.LoopEx;

public class LoopEx02 {

	public static void main(String[] args) {
		//
		for (int i = 0; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				if (i == 0) {
					System.out.print(" " + j + "단\t\t");
				} else {
					System.out.print(j + " * " + i + " = " + j * i + "\t");
				}
			}
			System.out.println();
		}
	}
}
