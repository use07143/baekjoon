package myPackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P18258 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Queue<Integer> queue = new LinkedList<>();
		int n = Integer.parseInt(br.readLine());
		int last = -1;
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			
			switch(s) {
			case "push":
				int num = Integer.parseInt(st.nextToken());
				queue.add(num);
				last = num;
				break;
			case "pop":
				try {
					bw.write(String.valueOf(queue.remove()) + "\n");
				} catch(Exception E) {
					bw.write("-1\n");
				}
				break;
			case "size":
				bw.write(String.valueOf(queue.size()) + "\n");
				break;
			case "empty":
				if(queue.size() == 0) bw.write("1\n");
				else bw.write("0\n");
				break;
			case "front":
				if(queue.size() != 0) {
					bw.write(String.valueOf(queue.peek()) + "\n");
				} else bw.write("-1\n");
				break;
			case "back":
				if(queue.size() != 0) {
					bw.write(String.valueOf(last) + "\n");
				} else bw.write("-1\n");
				break;
			}			
		}
		
		bw.flush();
		bw.close();
	}

}
