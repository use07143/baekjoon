package myPackage;

import java.io.*;
import java.util.*;

public class P3052 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = Integer.parseInt(br.readLine()) % 42;
		}
		
		int[] arr_f = Arrays.stream(arr).distinct().toArray();
		
		bw.write(arr_f.length + "\n");
		
		br.close();
		bw.flush();
		bw.close();
	}
}