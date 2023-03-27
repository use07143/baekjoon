package myPackage;

import java.io.*;

public class P16916 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		String sub = br.readLine();
		
		if(KMP(str,sub)) bw.write("1");
		else bw.write("0");

		br.close();
		bw.flush();
		bw.close();
	}
	
	static boolean KMP(String str, String sub) {
		int[] table = makeTable(sub);
			
		int n1 = str.length();
		int n2 = sub.length();
			
		int idx = 0;
		for(int i = 0; i < n1; i++) {
			while(idx > 0 && str.charAt(i) != sub.charAt(idx)) {
				idx = table[idx-1];
			}
			if(str.charAt(i) == sub.charAt(idx)) {
				if(idx == n2-1) {
					return true;
				}else {
					idx += 1;
				}
			}
		}
		return false;
	}
	
	static int[] makeTable(String str) {
		int n = str.length();
		int[] table = new int[n];
			
		int idx = 0;
		for(int i = 1; i < n; i++) {
			while(idx > 0 && str.charAt(i) != str.charAt(idx)) {
				idx = table[idx-1];
			}
				
			if(str.charAt(i) == str.charAt(idx)) {
				idx += 1;
				table[i] = idx;  
			}
		}
		return table;
	}
}