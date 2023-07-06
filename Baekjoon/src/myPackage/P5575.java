package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P5575 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int total_1 = Integer.parseInt(st.nextToken()) * 3600;
			total_1 += Integer.parseInt(st.nextToken()) * 60;
			total_1 += Integer.parseInt(st.nextToken());
			
			int total_2 = Integer.parseInt(st.nextToken()) * 3600;
			total_2 += Integer.parseInt(st.nextToken()) * 60;
			total_2 += Integer.parseInt(st.nextToken());
			
			int time = total_2 - total_1;
			bw.write(time / 3600 + " ");
			time %= 3600;
			bw.write(time / 60 + " ");
			time %= 60;
			bw.write(time + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}
