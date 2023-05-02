package myPackage;

import java.io.*;

public class P5597_1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[30];
		int n = 0;
		
		for(int i = 0; i < 28; i++) {
			n = Integer.parseInt(br.readLine());
			arr[n-1] = n;
		}
		
		for(int i = 1; i < 31; i++) {
			if(arr[i-1] == 0) bw.write(i + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}
}