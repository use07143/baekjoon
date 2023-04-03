package myPackage;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11399 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum = 0, temp = 0;
		
		Arrays.sort(arr);
		
		for(int i = 0; i < n; i++) {
			sum += (arr[i] + temp);
			temp += arr[i];
		}
		
		bw.write(sum + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
