import java.util.ArrayList;

class EmpData {
	private ArrayList alist;
	private int[] numbers;
	 EmpData() {
		this.alist = new ArrayList();
		this.numbers = new int[10];
	}
	//손으로다가 alist의 게터 세터를 만들어라
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
		
		ArrayList alist2 = new ArrayList(199); //카파시티 설정 가능 그러나 잘안씀 왜인지는 스스로 생각할것 ㅡ,ㅡ
		
		
	}
}
