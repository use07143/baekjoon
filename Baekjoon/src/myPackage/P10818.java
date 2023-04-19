package myPackage;

import java.util.*;
import java.io.*;

public class P10818 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer arr = new StringTokenizer(br.readLine());
		int min = 0, max = 0, a = 0;
		
		for(int i = 0; i < n; i++) {
			a = Integer.parseInt(arr.nextToken());
			
			if(i == 0) min = max = a;
			if(a < min) min = a;
			if(a > max) max = a;
		}
		
		bw.write(min + " " + max);
		
		br.close();
		bw.flush();
		bw.close();
	}
}
