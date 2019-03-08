package kr.ro.bit;
//뛰뤼얼 롸이줘블 안붙어있으면 재조립 안되므
import java.io.Serializable;

/*
 객체를 주고 받는 방법(객채통신)
 네트워크...(프로세스)
 파일간에...(파일에다 객체를 write, 그 파일은 read)
 
 직렬화 (객체를 분해해서 줄을 세워 보내는 과정)
 역직렬화(받은 객체를 조립해서 만드는 행위)
 
 네퉉은 안되고용
 실습) txt뽜일
 
 객체를 파일에다가 write (직렬화)
 파일을 read(역직렬화)
 
 직렬화가 가능한 객채를 만드는 설계도가 필요!
 
 조건(객체 통신) 설계도는 반드시 뛰리얼 롸이줘블 붙여라 (inplement serializable)
 
 
 */

public class UserInfo implements Serializable {
	public String name;
	public String pwd;
	public int age;
	
	public UserInfo() {
		
	}
	public UserInfo(String name, String pwd, int age) {
		this.name = name;
		this.pwd = pwd;
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", pwd=" + pwd + ", age=" + age + "]";
	}
	
	
}
