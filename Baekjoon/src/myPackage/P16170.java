package myPackage;

import java.io.*;
import java.util.*;

public class P16170 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(cal.YEAR));
		System.out.println(cal.get(cal.MONTH)+1);
		System.out.println(cal.get(cal.DATE));
		
		bw.flush();
		bw.close();
	}
}
