package kr.or.bit;

import java.io.IOException;

public class ExClass {
	public ExClass(String path) throws IOException, ArithmeticException {
		
	}
	
	public void call() throws ArithmeticException, IndexOutOfBoundsException {
		System.out.println("¬ž¿À~");
		int i = 1/0;
		System.out.println("call ÇÜ¼ö end");
	}
}
