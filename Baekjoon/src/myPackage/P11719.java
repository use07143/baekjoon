package myPackage;

import java.io.*;

public class P11719 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str ;
		while((str = br.readLine()) != null) {			
			bw.write(str + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
