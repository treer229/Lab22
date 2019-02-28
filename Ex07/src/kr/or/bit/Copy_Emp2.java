package kr.or.bit;

//DTO, VO, DOMAIN
//DTO = Data Transfer Object
//VO = value object
//DOMAIN = ������ ������ �ִ� Ŭ����



//Emp e = new Emp(); ��� �Ѹ��� ������ ���� �� �ִ� ��ü



public class Copy_Emp2 {
	private int empno;
	private String ename;
	private int sal;
	public Copy_Emp2(int empno, String ename, int sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getsal() {
		return sal;
	}
	public void setsal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + sal + "]";
	}
	
	
	
}
