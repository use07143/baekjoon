package myPackage;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P10867 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		bw.write(arr[0] + " ");
		
		for(int i = 1; i < n; i++) {
			if(arr[i-1] == arr[i]) continue;
			
			bw.write(arr[i] + " ");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
