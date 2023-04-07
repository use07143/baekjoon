package myPackage;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class P26069 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		HashSet<String> list = new HashSet<>();
		String str1, str2;
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			str1 = st.nextToken();
			str2 = st.nextToken();
			
			if(str1.equals("ChongChong")) {
				list.add(str2);
			} else if(str2.equals("ChongChong")) {
				list.add(str1);
			} else if(list.contains(str1)) {
				list.add(str2);
			} else if(list.contains(str2)) {
				list.add(str1);
			}
		}
		
		bw.write(list.size() + 1 + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
