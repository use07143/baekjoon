package myPackage;

import java.io.*;

public class P1193 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 1;
		
		if( n != 1 ) {
			while(n - cnt > 0) {
				n -= cnt;
				cnt++;
			}
		}
		
		int[] arr = new int[cnt+1];
		
		for(int i = 1; i <= cnt; i++) {
			arr[i] = i;
		}
		
		if(cnt % 2 == 0) {
			bw.write(arr[n] + "/" + arr[cnt-n+1]);
		} else {
			bw.write(arr[cnt-n+1] + "/" + arr[n]);
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
