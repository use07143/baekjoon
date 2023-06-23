package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P11134 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int total = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			
			int k = total / num;
			
			if(total % num != 0) k++;
			bw.write(k + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}
