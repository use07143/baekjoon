package myPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class P2581_1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		int sum = 0, min = 0;
		
		int[] arr = new int[M+1];
		
		for(int i = 2; i <= M; i++) {
			arr[i] = i;
		}
		
		for(int i = 2; i < M; i++) {
			if(arr[i] == 0) continue;
			for(int j = i+i; j <= M; j +=i) {
				arr[j] = 0;
			}
		}
		
		for(int i = N; i <= M; i++) {
			sum += arr[i];
			if(min == 0) min = arr[i];
		}
		
		if(sum != 0) bw.write(sum + "\n" + min);
		else bw.write("-1");
		
		br.close();
		bw.flush();
		bw.close();
	}
}