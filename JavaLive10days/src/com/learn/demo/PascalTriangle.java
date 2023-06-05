package com.learn.demo;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	private static List<List<Integer>> pT = new ArrayList<>();
	private static List<Integer> row, pre = null;

	public static void main(String args[]) {
		int line = 5;
		pT = pTri(line);

		for (List<Integer> p : pT) {
			System.out.println(p);
		}

		System.out.println(pT);
	}

	public static List<List<Integer>> pTri(int lines) {

		for (int i = 0; i < lines; i++) {
			row = new ArrayList<>();
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i)
					row.add(1);
				else
					row.add(pre.get(j - 1) + pre.get(j));

			}
			pre = row;
			pT.add(row);
		}
		return pT;

	}

}
