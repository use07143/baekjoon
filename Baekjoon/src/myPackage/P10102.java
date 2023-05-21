package myPackage;

import java.io.*;

public class P10102 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int a = 0, b = 0;
		
		for(int i = 0; i < n; i++) {
			if(str.charAt(i) == 'A') a++;
			else b++;
		}
		
		if(a > b) bw.write("A");
		else if(a < b) bw.write("B");
		else bw.write("Tie");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
