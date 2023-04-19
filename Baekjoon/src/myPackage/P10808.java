package myPackage;

import java.io.*;

public class P10808 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int[] arr = new int[26];
		
		for(int i = 0; i < str.length(); i++) {
			for(int j = 0; j < 26; j++) {
				if(str.charAt(i) == (j+97)) arr[j]++;
			}
		}
		
		for(int i = 0; i < 26; i++) {
			bw.write(arr[i] + " ");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
