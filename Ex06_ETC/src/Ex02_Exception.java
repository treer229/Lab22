
public class Ex02_Exception {
	public static void main(String[] args) {
		int num = 100;
		int result = 0;
		

		
		try {
			for(int i = 0; i<10; i++) {
				result = (int)(Math.random()*10); //0~9 ����
				System.out.println(result + i);
			}
		}	catch(ArithmeticException s) {
				
			} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			//�������� catch block ���� ����
			//���� ���ܰ� �׻� ����
	
		
		System.out.println("Main End");
		
	}
}
