package kr.or.bit;

//DTO, VO, DOMAIN
//DTO = Data Transfer Object
//VO = value object
//DOMAIN = 업무를 가지고 있는 클래스



//Emp e = new Emp(); 사원 한명의 정보를 담을 수 있는 객체



public class Emp {
	private int empno;
	private String ename;
	private String job;
	public Emp(int empno, String ename, String job) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job + "]";
	}
	
	
	
}
