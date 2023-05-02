package myPackage;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class P5597 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[28];
		int a = 0, b = 0;

		for(int i = 0; i < 28; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 1; i <= 30; i++) {
			boolean tf = Arrays.stream(arr)
	                .boxed()
	                .collect(Collectors.toSet())
	                .contains(i);
			if(!tf) {
				if(a == 0) a = i;
				else b = i;
			}
			
		}
		
		if (a < b) bw.write(a + "\n" + b);
		else bw.write(b + "\n" + a);

		br.close();
		bw.flush();
		bw.close();
	}
}