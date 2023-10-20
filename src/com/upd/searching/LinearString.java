package com.upd.searching;
public class LinearString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name = "Dipankar";
		int num = name.length();
		char word = 'n';
		System.out.println(str(name , num, word));
	}
	
	static int str(String name, int num, char word) {
		if(name.length() == 0) {
			return -1;
		}
		
		for(int i=0; i<num; i++) {
			if(name.charAt(i) == word) {
				return i;
			}
		}
		return -1;
	}

}
