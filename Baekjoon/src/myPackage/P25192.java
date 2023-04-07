package myPackage;

import java.io.*;
import java.util.HashSet;

public class P25192 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		HashSet<String> list = new HashSet<>();
		String str;
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			str = br.readLine();
			
			if(str.equals("ENTER")) {
				cnt += list.size();
				list.clear();
				continue;
			}
			
			list.add(str);
		}
		
		bw.write(cnt + list.size() + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
