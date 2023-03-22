package myPackage;

import java.util.*;
import java.io.*;

public class P10952 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int sum;
		
		while(true) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			
			if(sum == 0) break;
			
			bw.write(sum + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
