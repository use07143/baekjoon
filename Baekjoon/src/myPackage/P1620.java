package myPackage;

import java.io.*;
import java.util.StringTokenizer;
import java.lang.StringBuilder;
import java.util.HashMap;

public class P1620 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		String[] arr = new String[N+1];
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i = 1; i <= N; i++) {
			arr[i] = br.readLine();
			map.put(arr[i], i);
		}
		
		StringBuilder ans = new StringBuilder();
		
		for(int i = 0; i < M; i++) {
			String str = br.readLine();
			if(isInteger(str)) {
				ans.append(arr[Integer.parseInt(str)] + "\n");
			} else {
				ans.append(map.get(str) + "\n");
			}
		}
		
		
		bw.write(ans.toString());
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static boolean isInteger(String strValue) {
	    try {
	      Integer.parseInt(strValue);
	      return true;
	    } catch (NumberFormatException ex) {
	      return false;
	    }
	  }
}
