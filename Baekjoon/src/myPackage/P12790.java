package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P12790 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int hp = Integer.parseInt(st.nextToken());
			int mp = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			
			hp += Integer.parseInt(st.nextToken());
			mp += Integer.parseInt(st.nextToken());
			a += Integer.parseInt(st.nextToken());
			s += Integer.parseInt(st.nextToken());
			
			if(hp < 1) hp = 1;
			if(mp < 1) mp = 1;
			if(a < 0) a = 0;
			
			int total = hp + (5 * mp) + (2 * a) + (2 * s);
			bw.write(total + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}
