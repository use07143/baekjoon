package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P13458 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st1.nextToken());
		}
		
		long sum = 0;
		int A = Integer.parseInt(st2.nextToken());
		int B = Integer.parseInt(st2.nextToken());
		
		sum += n;
		
		for(int i = 0; i < n; i++) {
			arr[i] -= A;
			if(arr[i] <= 0) continue;
			
			sum += arr[i] / B;
			if(arr[i] % B != 0) sum++;
		}
		
		bw.write(sum + "");
		
		br.close();
		bw.flush();
		bw.close();

	}

}
