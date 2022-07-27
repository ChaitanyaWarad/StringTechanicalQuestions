package com.javatpoint;

public class ReverseTheString {

	public static void main(String[] args) {

		String st = "calmin is a good marker pen";
		char ch[] = st.toCharArray();
		st = " ";

		for (int i = ch.length - 1; i >= 0; i--) {

			int k = i;

			while (i >= 0 && ch[i] != ' ') {
				i--;

			}

			int j = i + 1;

			while (j <= k) {
				st = st + ch[j];
				j++;
			}
			if (i >= 0) {
				st = st + ch[i];
			}

		}

		System.out.println(st);
	}

}
 