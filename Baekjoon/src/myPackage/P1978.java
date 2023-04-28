package myPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1978 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int num, count = 0;
		int pf;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			num = Integer.parseInt(st.nextToken());
			
			pf = 1;
			if(num == 1) continue;
			if(num == 2) {
				count++;
				continue; 
			}

			for(int j = 2; j < num; j++) {
				if(num % j == 0) {
					pf = 0;
					break;
				}
			}
			
			if(pf == 1) count++;
		}
		bw.write(count + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}