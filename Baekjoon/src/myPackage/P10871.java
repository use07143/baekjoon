package myPackage;

import java.util.*;
import java.io.*;

public class P10871 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		StringTokenizer arr_st = new StringTokenizer(br.readLine());
		int a = 0;
		
		for(int i = 0; i < n; i++) {
			a = Integer.parseInt(arr_st.nextToken());
			if(a < k)
				bw.write(a + " ");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
