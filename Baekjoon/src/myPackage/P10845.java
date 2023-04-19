package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P10845 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] stack = new int[n]; // stack
		int num;
		int front = -1, back = -1;
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String imp = st.nextToken();
			if(imp.equals("push")) { // push
				num = Integer.parseInt(st.nextToken());
				back++;
				stack[back] = num;
				if(front == -1) front++;
			}
			else if(imp.equals("pop")) { // pop
				if(front == -1 || (back - front) < 0) bw.write("-1\n");
				else {
					bw.write(stack[front] + "\n");
					front++;
				}
			}
			else if(imp.equals("size")) { // size
				if(back-front < 0 || front == -1) {
					bw.write("0\n");
				} else {
					bw.write(back-front+1 + "\n");
				}
			}
			else if(imp.equals("empty")) { // empty
				if(back-front < 0 || front == -1) bw.write("1\n");
				else bw.write("0\n");
			}
			else if(imp.equals("front")) { // top
				if(back-front < 0 || front == -1) bw.write("-1\n");
				else bw.write(stack[front] + "\n");
			}
			else if(imp.equals("back")) { //back
				if(back-front < 0 || front == -1) bw.write("-1\n");
				else bw.write(stack[back] + "\n");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
