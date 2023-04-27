package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P1267 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int Y = 0, M = 0;
		
		for(int i = 0; i < n; i++) {
			int time = Integer.parseInt(st.nextToken());
			if(time < 30) Y += 1;
			else Y += (time / 30 + 1);
			
			if(time < 60) M += 1;
			else M += (time / 60 + 1);
		}
		
		Y *= 10; M *= 15;
		
		if(Y < M) bw.write("Y " + Y);
		else if(M < Y) bw.write("M " + M);
		else bw.write("Y M " + Y);
		
		br.close();
		bw.flush();
		bw.close();
	}
}
