package myPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P5086 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a, b;
		
		while(true) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			a = Integer.parseInt(str.nextToken());
			b = Integer.parseInt(str.nextToken());
			
			if((a == 0) && (b == 0)) break;
			
			if(a % b == 0) bw.write("multiple\n");
			else if(b % a == 0) bw.write("factor\n");
			else bw.write("neither\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}