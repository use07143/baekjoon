package myPackage;

import java.io.*;
import java.util.*;

public class P4344 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int C = Integer.parseInt(br.readLine());
		int n = 0, count = 0;
		double sum, avg, stu;
		int[] arr = null;
		StringTokenizer str;
		
		for(int i = 0; i < C; i++) {
			sum = 0.0;
			count = 0;
			str = new StringTokenizer(br.readLine());
			n = Integer.parseInt(str.nextToken());
			
			arr = new int[n];
			for(int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(str.nextToken());
				sum += arr[j];
			}
			
			avg = sum / n;
			
			for(int j = 0; j < n; j++) {
				if(arr[j] > avg) count++;
			}
			
			stu = count/(double)n*100;
			String per = String.format("%.3f", stu);
			bw.write(per + "%\n");
		}
		
		
		br.close();
		bw.flush();
		bw.close();
	}
}