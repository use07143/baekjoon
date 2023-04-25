package myPackage;

import java.io.*;

public class P1550 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String st = br.readLine();
		int i = 0, dec = 0;
		
		while(i < st.length()) {
			
			switch(st.charAt(st.length() - i-1)) {
			case 'A':
				dec += (10 * Math.pow(16, i));
				break;
			case 'B':
				dec += (11 * Math.pow(16, i));
				break;
			case 'C':
				dec += (12 * Math.pow(16, i));
				break;
			case 'D':
				dec += (13 * Math.pow(16, i));
				break;
			case 'E':
				dec += (14 * Math.pow(16, i));
				break;
			case 'F':
				dec += (15 * Math.pow(16, i));
				break;
			default:
				dec += ((st.charAt(st.length() - i-1) - '0') * Math.pow(16, i));
				break;
			}
			i++;
		}
		
		bw.write(dec + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}