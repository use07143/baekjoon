package myPackage;

import java.io.*;
import java.util.*;

public class P5622 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		
		int t = 0;		

		for(int i = 0; i < str.length(); i++) { 
			int temp = (int)(str.charAt(i) - 'A')/3 + 3;
			if(str.charAt(i) == 'Z') temp -= 1;
		 
			t += temp; 
		}
		 
		bw.write(t+"\n");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
