package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P19944 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		if(m == 1 || m == 2) bw.write("NEWBIE!");
		else if(m <= n) bw.write("OLDBIE!");
		else bw.write("TLE!");
		
		bw.flush();
		bw.close();
	}
}
