package myPackage;

import java.io.*;

public class P2941 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int len = str.length();
		int n = 0, count = 0;
		
		while(n < len) {
			
			switch(str.charAt(n)) {
			case 'c':
				if((n < len-1) && ((str.charAt(n+1) == '=') || (str.charAt(n+1) == '-'))) {
					count++;
					n++;
				} else count++;
				break;
			case 'd':
				if((n < len-2) && (str.charAt(n+1) == 'z') && (str.charAt(n+2) == '=')) {
					count++;
					n += 2;
				} else if((n < len-1) && (str.charAt(n+1) == '-')) {
					count++;
					n++;
				} else count++;
				break;
			case 'l':
				if((n < len-1) && (str.charAt(n+1) == 'j')) {
					count++;
					n++;
				} else count++;
				break;
			case 'n':
				if((n < len-1) && (str.charAt(n+1) == 'j')) {
					count++;
					n++;
				} else count++;
				break;
			case 's':
				if((n < len-1) && (str.charAt(n+1) == '=')) {
					count++;
					n++;
				} else count++;
				break;
			case 'z':
				if((n < len-1) && (str.charAt(n+1) == '=')) {
					count++;
					n++;
				} else count++;
				break;
			default: 
				count++;
				break;
			}
			n++;
		}
		
		bw.write(count + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}