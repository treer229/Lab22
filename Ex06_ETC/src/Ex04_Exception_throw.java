import java.io.IOException;

import kr.or.bit.ExClass;
//예외를 강제하도록 설계....
/*
 throws
 */

public class Ex04_Exception_throw {

		public static void main(String[] args) {
			ExClass ex;
			try {
				 ex = new ExClass("C:\\Temp");
				 ex.call();
			} catch (IOException e) {
		
				e.printStackTrace();
			} catch (ArithmeticException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		
			
			
		}
	
}
