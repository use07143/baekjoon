package myPackage;

import java.io.*;

public class P15873 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int sum = 0;
		
		if(s.length() == 2) {
			int n1 = Integer.parseInt(s.substring(0, 1));
			int n2 = Integer.parseInt(s.substring(1));
			sum = n1 + n2;
		} else if(s.length() == 3) {
			if(s.charAt(1) == '0') {
				int n1 = Integer.parseInt(s.substring(0, 2));
				int n2 = Integer.parseInt(s.substring(2));
				sum = n1 + n2;
			} else {
				int n1 = Integer.parseInt(s.substring(0, 1));
				int n2 = Integer.parseInt(s.substring(1));
				sum = n1 + n2;
			}
		} else sum = 20;
		
		bw.write(sum + "");
		
		bw.flush();
		bw.close();
	}
}
