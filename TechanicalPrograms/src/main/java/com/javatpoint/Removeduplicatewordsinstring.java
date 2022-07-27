package com.javatpoint;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Removeduplicatewordsinstring {

	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("welcome to geeks for geeks to homeland", " ");
		ArrayList<String> a1 = new ArrayList<String>();
		while (st.hasMoreTokens()) {
			a1.add(st.nextToken());
		}
		System.out.println(a1);

		a1.stream().distinct().forEach(a -> System.out.println(a));

	}

}
