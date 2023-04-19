package myPackage;

import java.io.*;
 
public class P1003 {
 
	static Integer[][] f = new Integer[41][2];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		f[0][0] = 1; f[0][1] = 0;
		f[1][0] = 0; f[1][1] = 1;
		
		int T = Integer.parseInt(br.readLine());
        
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			fib(n);
			bw.write(f[n][0] + " " + f[n][1] + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
	public static Integer[] fib(int N) {
		
		if(f[N][0] == null || f[N][1] == null) {
			f[N][0] = fib(N - 1)[0] + fib(N - 2)[0];
			f[N][1] = fib(N - 1)[1] + fib(N - 2)[1];
		}
		return f[N];
	}
 
}