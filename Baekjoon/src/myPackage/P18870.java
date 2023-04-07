package myPackage;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.HashMap;
import java.lang.StringBuilder;

public class P18870 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] sort = arr.clone(); // copy
		Arrays.sort(sort); // sort
		
		int cnt = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < n; i++) {
			if(!map.containsKey(sort[i])) {
				map.put(sort[i], cnt++);
			}
		}
		
		StringBuilder ans = new StringBuilder();
		for(int i = 0; i < n; i++) {
			ans.append(map.get(arr[i]) + " ");
		}
		bw.write(ans.toString());
		
		br.close();
		bw.flush();
		bw.close();
	}
}
