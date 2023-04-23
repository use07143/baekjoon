package myPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class P1316 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		String str = "";
		int v = 1;
		
		for(int i = 0; i < n; i++) {
			str = br.readLine();
			for(int j = 0; j < str.length()-1; j++) {
				if(str.charAt(j) != str.charAt(j+1)) {
					if(str.lastIndexOf(str.charAt(j)) != j) v = 0;
				}
			}
			
			if(v == 1) count++;
			v = 1;
		}
		
		bw.write(count + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}