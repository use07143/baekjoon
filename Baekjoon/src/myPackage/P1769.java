package myPackage;

import java.io.*;

public class P1769 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String x = br.readLine();
		int sum, count = 0;
		
		while(true) {
			if(x.length() == 1) break;
			
			sum = 0;
			for(int i = 0; i < x.length(); i++) {
				sum += Integer.parseInt(String.valueOf(x.charAt(i)));
			}
			x = String.valueOf(sum);
			count++;
		}
		
		bw.write(count + "\n");
		
		if(Integer.parseInt(String.valueOf(x)) % 3 == 0) bw.write("YES");
		else bw.write("NO");
		
		bw.flush();
		bw.close();
	}
}
