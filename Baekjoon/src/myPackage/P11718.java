package myPackage;

import java.io.*;

public class P11718 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		String input = "";
		
		while(((input = br.readLine())!=null)&&(!input.isEmpty())) {
			bw.write(input+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
