package myPackage;

import java.io.*;
import java.util.*;

public class P25206 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = 0;
		double credit = 0.0, sum = 0.0, grade_sc = 0.0;
		StringTokenizer str;
		String grade;
		
		for(int i = 0; i < 20; i ++) {
			str = new StringTokenizer(br.readLine());
			grade = str.nextToken();
			credit = Float.parseFloat(str.nextToken());
			grade = str.nextToken();
			
			if(grade.charAt(0) != 'P') {
				switch(grade) {
				case "A+":
					grade_sc = 4.5;
					break;
				case "A0":
					grade_sc = 4.0;
					break;
				case "B+":
					grade_sc = 3.5;
					break;
				case "B0":
					grade_sc = 3.0;
					break;
				case "C+":
					grade_sc = 2.5;
					break;
				case "C0":
					grade_sc = 2.0;
					break;
				case "D+":
					grade_sc = 1.5;
					break;
				case "D0":
					grade_sc = 1.0;
					break;
				case "F":
					grade_sc = 0.0;
					break;
				}
				sum += (credit * grade_sc);
				count += credit;
			}
		}
		
		bw.write(sum/count + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}