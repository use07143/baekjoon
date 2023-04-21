package myPackage;

import java.io.*;

public class P1157_1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int[] arr = new int[26];
		int max = -1;
		char ch = '?';
		
		for(int i = 0; i < str.length(); i++) {
			if ( 64 < str.charAt(i) && str.charAt(i) < 91) {
				arr[str.charAt(i) - 65]++;
			} else 
				arr[str.charAt(i) - 97]++;
		}
		
		for(int i = 0; i < 26; i++) {
			if( max < arr[i] ) {
				max = arr[i];
				ch = (char) (i + 65);
			} else if ( arr[i] == max ) {
				ch = '?';
			}
		}
		bw.write(ch);
		
		br.close();
		bw.flush();
		bw.close();
	}
}