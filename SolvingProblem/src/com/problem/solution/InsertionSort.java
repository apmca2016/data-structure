package com.problem.solution;

import java.util.Arrays;

public class InsertionSort {

	/*public static int[] insertionSort(int[] a) {
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			int element = a[i];
			j = i;
			while (j > 0 && a[j - 1] > element) {
				a[j] = a[j - 1];
				j = j - 1;
			}
			a[j] = element;
		}
		return a;
	}*/

	public static int[] pracInsertSort(int[] a) {
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			int element = a[i];
			j = i;
			while (j > 0 && a[j - 1] > element) {
				a[j] = a[j - 1];
				j = j - 1;
			}
			a[j] = element;
		}
		return a;
	}

	public static void main(String[] args) {
		int[] a = { 12, 14, 13, 23, 19, 24, 21 };
	//	System.out.println(Arrays.toString(insertionSort(a)));

		System.out.println(Arrays.toString(pracInsertSort(a)));

	}

}
