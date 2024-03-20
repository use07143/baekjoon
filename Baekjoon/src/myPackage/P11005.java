package myPackage;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P11005 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		ArrayList<Integer> arr = new ArrayList<Integer>(); // list
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		while(n >= b) {
			int a = n % b;
			if(a > 9) {
				arr.add(a + 55);
			} else {
				arr.add(a + 48);
			}
			n /= b;
		}
		if(n != 0) {
			if(n > 9) arr.add(n + 55);
			else arr.add(n + 48);
		}
		
		for(int i = arr.size()-1; i >= 0; i--) {
			bw.write(arr.get(i));
		}
		
		bw.flush();
		bw.close();
	}
}
