package myPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class P10798 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[][] arr = new int[5][15];
		String str = "";
		int n;
		
		for(int i = 0; i < 5; i++) {
			str = br.readLine();
			n = str.length();
			for(int j = 0; j < 15; j++) {
				if(j < n) {
					arr[i][j] = str.charAt(j);
				}
				else {
					arr[i][j] = ' ';
				}
			}
		}
		
		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 5; j++) {
				if(arr[j][i] != ' ') bw.write(arr[j][i]);
			}
		}

		br.close();
		bw.flush();
		bw.close();
	}
}