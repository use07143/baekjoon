package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P1924 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int month = Integer.parseInt(st.nextToken());
		int day = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i < month; i++) {
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
				day += 31;
			} else if (i == 4 || i == 6 || i == 9 || i == 11) {
				day += 30;
			} else day += 28;
		}
		
		day %= 7;
		
		switch(day) {
		case 1:
			bw.write("MON");
			break;
		case 2:
			bw.write("TUE");
			break;
		case 3:
			bw.write("WED");
			break;
		case 4:
			bw.write("THU");
			break;
		case 5:
			bw.write("FRI");
			break;
		case 6:
			bw.write("SAT");
			break;
		default:
			bw.write("SUN");
			break;
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
