package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P15953 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int sum = 0;
			
			if(a == 1) sum += 5000000;
			else if(a == 2 || a == 3) sum += 3000000;
			else if(3 < a && a < 7) sum += 2000000;
			else if(6 < a && a < 11) sum += 500000;
			else if(10 < a && a < 16) sum += 300000;
			else if(15 < a && a < 22) sum += 100000;
			
			if(b == 1) sum += 5120000;
			else if(b == 2 || b == 3) sum += 2560000;
			else if(3 < b && b < 8) sum += 1280000;
			else if(7 < b && b < 16) sum += 640000;
			else if(15 < b && b < 32) sum += 320000;
			
			bw.write(sum + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
