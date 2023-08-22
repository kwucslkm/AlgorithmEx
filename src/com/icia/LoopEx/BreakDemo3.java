package com.icia.LoopEx;

import java.util.Scanner;

public class BreakDemo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int passWord = 1234;
		for (; true;) {
			System.out.print(" 비밀번호 입력> ");
			if (sc.hasNextInt()) {
				if (passWord == sc.nextInt()) {
					System.out.println("비밀번호 확인 되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 틀립니다.");
				}

			} else {
				String inputString = sc.next();
				System.out.println("*문자 " + inputString + " 입력, 비밀번호는 숫자만 입력 가능합니다.");
				continue;
			}
		}
		System.out.println(" 정보수정 페이지로 이동합니다.");
		sc.close();

	}

}
//Scanner sc = new Scanner(System.in);
//int passWord = 1234;
//int inputPassword;
//for (; true;) {
//	System.out.print(" 비밀번호 입력> ");
//	if (sc.hasNextInt()) {
//		inputPassword = sc.nextInt();
//		if (inputPassword == passWord) {
//			System.out.println("비밀번호 확인 되었습니다.");
//			break;
//		} else {
//			System.out.println("비밀번호가 틀립니다.");
//		}
//
//	} else {
//		String inputString = sc.next();
//		System.out.println("*문자 " + inputString + " 입력, 비밀번호는 숫자만 입력 가능합니다.");
//		continue;
//	}
//}
//System.out.println(" 정보수정 페이지로 이동합니다.");
//sc.close();
