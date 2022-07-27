package com.javatpoint;

public class CountWords {

	public static void main(String[] args) {

		String st = "chitradurga is a fort city";
		int c = 0;
		char ch[] = st.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if ((i == 0 && ch[i] != ' ') || (ch[i] != ' ' && ch[i - 1] == ' ')) {
				c++;
			}
		}
		System.out.println("No of words are : " + c);

	}

}
