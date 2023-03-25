package myPackage;

import java.io.*;
import java.util.*;

public class P1157 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		str = str.toUpperCase();
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		
		int count = 1, temp = 1;
		char t = arr[0];
		
		int i;
		for(i = 0; i < str.length()-1; i++) {
			if(arr[i] == arr[i+1]) {
				if(arr[i] == arr[0]) count++;
				else temp++;
			} else {
				if(count < temp) {
					count = temp;
					t = arr[i];
					temp = 1;
				} else if(count == temp) {
					t = '?';
					temp = 1;
				} else temp = 1;
			}
		}
		
		if(temp != 1) {
			if((temp == count) && (str.length() != 1)) t = '?';
			else if(temp > count) t = arr[i];
		}
		
		bw.write(t);
		
		br.close();
		bw.flush();
		bw.close();
	}
}