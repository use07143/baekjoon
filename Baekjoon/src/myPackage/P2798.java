package myPackage;

import java.io.*;
import java.util.StringTokenizer;

public class P2798 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		
		int sum = 0, max = 0;
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int x = 0; x < N; x++) {
			for(int y = 0; y < N; y++) {
				for(int z = 0; z < N; z++) {
					if(x != y && x != z && y != z) {
						sum = arr[x]+arr[y]+arr[z];
						if(sum > max && sum <= M) max = sum;
					}
				}
			}
		}
		
		bw.write(max + "");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
