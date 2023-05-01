package myPackage;

import java.io.*;

public class P4673 {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i = 1; i < 10000; i++) {
			if(self(i) == 0) bw.write(i + "\n");
		}
		
		bw.flush();
		bw.close();
	}
	
	public static int self(int n) {
		int sum = 0;
		for(int i = 1; i < n; i++) {
			sum = i;
			int temp = i;
			
			while(temp != 0) {
				sum += (temp % 10);
				temp /= 10;
			}
			
			if(sum == n) return 1;
		}
		return 0;
	}
}
