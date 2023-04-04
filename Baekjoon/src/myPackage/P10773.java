package myPackage;

import java.io.*;

public class P10773 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int num, top = 0;
		
		for(int i = 0; i < N; i++) {
			num = Integer.parseInt(br.readLine());
			if(num == 0) {
				arr[top] = 0;
				top--;
			} else {
				arr[top] = num;
				top++;
			}
		}
		
		int sum = 0;
		
		for(int i = 0; i < top; i++) {
			sum += arr[i];
		}
		bw.write(sum + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
