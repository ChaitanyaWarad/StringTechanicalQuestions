package com.javatpoint;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Removeduplicatewordsinstring2 {

	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("welcome to geeks for geeks to homeland", " ");
		ArrayList<String> a1 = new ArrayList<String>();
		while (st.hasMoreTokens()) {
			a1.add(st.nextToken());
		}
		System.out.println(a1);

		List<String> l1s = a1.stream().distinct().collect(Collectors.toList());
		System.out.println(l1s);

		LinkedHashSet<String> l = new LinkedHashSet<String>(a1);
		System.out.println(l);

		StringBuilder s = new StringBuilder();

		for (String string : l) {
			s.append(string+" ");
		}
		System.out.println(s);

		HashSet<String> h1 = new HashSet<String>(a1);
		System.out.println(h1);

	}

}
