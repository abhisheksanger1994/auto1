package demostream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class demotest {

	/*
	public static int printString() {
		System.out.println("hello world");
		return 0;
	}
	static int p = printString();
	*/
	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(0,3,10,20,30,15,1,13,2,2,10,40,19,3,40);
		
		int secH = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(secH);
				
		int secL = list.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println(secL);
		
	}	
}