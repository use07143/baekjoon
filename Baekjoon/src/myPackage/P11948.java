package myPackage;

import java.io.*;

public class P11948 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int sum1 = 0, sum2 = 0;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < 4; i++) {
			int sc = Integer.parseInt(br.readLine());
			sum1 += sc;
			
			if(sc < min) min = sc;
		}
		
		sum1 -= min;
		min = Integer.MAX_VALUE;
		
		for(int i = 0; i < 2; i++) {
			int sc = Integer.parseInt(br.readLine());
			sum2 += sc;
			
			if(sc < min) min = sc;
		}
		
		sum2 -= min;
		
		bw.write(sum1+sum2+"");
		
		bw.flush();
		bw.close();
	}
}
