package myPackage;

import java.io.*;

public class P5532 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int l = Integer.parseInt(br.readLine());
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		
		int n1 = 0, n2 = 0;
		
		if(a % c == 0) n1 = a / c;
		else n1 = (a / c) + 1;
		
		if(b % d == 0) n2 = b / d;
		else n2 = (b / d) + 1;
		
		if(n1 > n2) bw.write(l - n1 + "");
		else bw.write(l - n2 + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
