package myPackage;

import java.io.*;

public class P1977 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		int pow = (int) Math.sqrt(M);
		int[] arr = new int[pow];
		
		
		for(int i = 0, j = 1; i < pow; i++, j++) { 
			arr[i] = (int) Math.pow(j, 2);
		}
		
		int sum = 0;
		int min = (int)Math.sqrt(N);
		int min_pow = 0;
		
		for(int i = min-1; i < pow; i++) {
			if(arr[i] >= N) {
				if(sum == 0) min_pow = arr[i];
				sum += arr[i];
			}
		}
		
		if(sum == 0) bw.write("-1");
		else bw.write(sum + "\n" + min_pow);
		
		
		br.close();
		bw.flush();
		bw.close();
	}
}

