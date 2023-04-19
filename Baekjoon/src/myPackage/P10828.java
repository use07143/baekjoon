package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P10828 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] stack = new int[n]; // stack
		int num;
		int top = -1;
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String imp = st.nextToken();
			if(imp.equals("push")) { // push
				num = Integer.parseInt(st.nextToken());
				top++;
				stack[top] = num;
			}
			else if(imp.equals("pop")) { // pop
				if(top == -1) bw.write("-1\n");
				else {
					bw.write(stack[top] + "\n");
					top--;
				}
			}
			else if(imp.equals("size")) { // size
				bw.write(top+1 + "\n");
			}
			else if(imp.equals("empty")) { // empty
				if(top == -1) bw.write("1\n");
				else bw.write("0\n");
			}
			else if(imp.equals("top")) { // top
				if(top == -1) bw.write("-1\n");
				else bw.write(stack[top] + "\n");
			}
		}
		
		
		br.close();
		bw.flush();
		bw.close();
	}
}
