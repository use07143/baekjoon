package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P4493 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			int p1 = 0, p2 = 0;
			for(int j = 0; j < n; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				char v1 = st.nextToken().charAt(0);
				char v2 = st.nextToken().charAt(0);
				
				if(v1 == 'R') {
					if(v2 == 'S') p1++;
					else if(v2 == 'P') p2++;
				} else if(v1 == 'S') {
					if(v2 == 'R') p2++;
					else if(v2 == 'P') p1++;
				} else if(v1 == 'P') {
					if(v2 == 'R') p1++;
					else if(v2 == 'S') p2++;
				}
			}
			
			if(p1 > p2) bw.write("Player 1\n");
			else if(p1 < p2) bw.write("Player 2\n");
			else bw.write("TIE\n");
		}
		
		bw.flush();
		bw.close();
	}
}
