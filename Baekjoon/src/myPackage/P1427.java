package myPackage;

import java.io.*;
import java.util.Arrays;

public class P1427 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		int[] arr = new int[str.length()];
		for(int i = 0; i < str.length(); i++) {
			arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		
		Arrays.sort(arr);
		
		for(int i = str.length()-1; i >= 0; i--) {
			bw.write(arr[i] + "");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
