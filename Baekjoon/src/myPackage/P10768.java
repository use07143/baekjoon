package myPackage;

import java.io.*;

public class P10768 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		if(a < 2) bw.write("Before");
		else if(a > 2) bw.write("After");
		else {
			if(b < 18) bw.write("Before");
			else if(b > 18) bw.write("After");
			else bw.write("Special");
		}
		
		bw.flush();
		bw.close();
	}
}
