package myPackage;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P3047 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[3];
		
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		String str = br.readLine();
		
		for(int i = 0; i < 3; i++) {
			switch(str.charAt(i)) {
			case 'A':
				bw.write(arr[0] + " ");
				break;
			case 'B':
				bw.write(arr[1] + " ");
				break;
			case 'C':
				bw.write(arr[2] + " ");
				break;
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
