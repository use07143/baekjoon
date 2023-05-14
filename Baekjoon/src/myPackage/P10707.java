package myPackage;

import java.io.*;

public class P10707 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		int max = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int u = Integer.parseInt(br.readLine());
		
		x *= u;
		if(u > max) y += (c * (u - max));
		
		if(x>y) bw.write(y +"");
		else bw.write(x + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
