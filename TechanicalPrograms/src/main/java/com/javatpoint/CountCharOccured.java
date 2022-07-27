package com.javatpoint;

public class CountCharOccured {

	public static void main(String[] args) {
		String st = "chitradurga is a fort city";
		int c[] = new int[128];
		char ch[] = st.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			c[ch[i]]++;

		}

		for (int i = 0; i < c.length; i++) {
			if (c[i] > 0)
				System.out.println((char) (i) + " Occured  " + c[i] + " times");

		}
	}

}
