package myPackage;

import java.util.*;
import java.io.*;

public class P10951 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = "";
		
		while(((str = br.readLine()) != null) && (!str.isEmpty())) {
			StringTokenizer st = new StringTokenizer(str);
			bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
