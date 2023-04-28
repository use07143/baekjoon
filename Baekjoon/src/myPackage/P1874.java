package myPackage;

import java.io.*;
import java.lang.StringBuilder;

public class P1874 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int top = -1;
		int num = 1;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			int k = Integer.parseInt(br.readLine());
			
			if(top == -1) {
				arr[0] = num++;
				top++;
				sb.append("+\n");
			}
			
			while(k > arr[top]) {
				arr[++top] = num;
				num++;
				sb.append("+\n");
			}
			
			if(k == arr[top]) {
				arr[top] = 0;
				top--;
				sb.append("-\n");
			} else {
				System.out.println("NO");
				return;
			}
		}
		
		bw.write(sb.toString());
		
		br.close();
		bw.flush();
		bw.close();
	}
}
