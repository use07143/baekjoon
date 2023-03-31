package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P1292 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[m];
		int num = 1, i = 0;
		
		while(i < m) {
			for(int k = 0; k < num; k++) {
				arr[i] = num;
				i++;
				if(i == m) break;
			}
			num++;
		}
		
		int sum = 0;
		
		for(int k = n-1; k < m; k++) {
			sum += arr[k];
		}
		
		bw.write(sum + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
