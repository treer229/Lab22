import java.util.ArrayList;

class EmpData {
	private ArrayList alist;
	private int[] numbers;
	 EmpData() {
		this.alist = new ArrayList();
		this.numbers = new int[10];
	}
	//�����δٰ� alist�� ���� ���͸� ������
	 public ArrayList getAlist() {
		 return this.alist;
	 }
	 
	 public void setAlist(ArrayList alist) {
		 this.alist = alist;
	 }
	 
	 public int[] getNumbers() {
		 return this.numbers;
	 }
	 
	 public void setNumbers(int[] numbers) {
		 this.numbers = numbers;
	 }
	
}

public class Ex04_ArrayList_Parameter {
	public static void main(String[] args) {
		EmpData empdata = new EmpData();
		System.out.println(empdata);
		
		ArrayList alist = new ArrayList();
		empdata.setAlist(alist);
		alist.add(100);
		alist.add(200);
		alist.add(300);
		alist.add(400);
		System.out.println(empdata.getAlist().toString());
		
		ArrayList alist2 = new ArrayList(199); //ī�Ľ�Ƽ ���� ���� �׷��� �߾Ⱦ� �������� ������ �����Ұ� ��,��
		
		
	}
}
