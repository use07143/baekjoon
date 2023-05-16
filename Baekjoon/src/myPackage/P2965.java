package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P2965 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		if((b-a) > (c-b)) cnt = (b-a)-1;
		else cnt = (c-b)-1;
		
		bw.write(cnt+"");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
