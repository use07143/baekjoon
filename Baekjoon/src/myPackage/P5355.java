package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P5355 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		double num;
		String str = " ";
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			num = Double.parseDouble(st.nextToken());
			
			while(st.hasMoreTokens()) {
				str = st.nextToken();
				if(str.charAt(0) == '@') num *= 3;
				else if(str.charAt(0) == '%') num += 5;
				else if(str.charAt(0) == '#') num -= 7;
			}
			
			bw.write(String.format("%.2f", num) + "\n");
		}
		
		
		br.close();
		bw.flush();
		bw.close();
	}
}
