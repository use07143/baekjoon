package myPackage;

import java.io.*;

public class P24883 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		if(s.charAt(0) == 'n' || s.charAt(0) == 'N')
			bw.write("Naver D2");
		else 
			bw.write("Naver Whale");
		
		bw.flush();
		bw.close();
	}
}
