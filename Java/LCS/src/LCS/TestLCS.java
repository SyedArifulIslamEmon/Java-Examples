package LCS;

import java.util.Scanner;

public class TestLCS {

	public static void main(String[] args) {

		Scanner nScanner = new Scanner(System.in);

		String s1, s2;

		System.out.println("Enter 1st String -----> ");

		s1 = nScanner.next();

		System.out.println("Enter 1st String -----> ");

		s2 = nScanner.next();

		LCS lcs = new LCS(s1, s2);

		lcs.AllZero();

		String a = lcs.lCSfind();

		System.out.println("Longest Common SubSequnce ------> " + a);

	}

}
