import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 HashMap 사용한 로그한 시스템

        //회원 로그인 데이터 HashMap 으로 관리
        HashMap loginmap = new HashMap();
        loginmap.put("kim", "kim1004");
        loginmap.put("scott", "tiger");
        loginmap.put("lee", "kim1004");
        
        //시스템에 로그인 하는 시나리오
        //ID(0) , PWD(0)  >> 회원  (환영)
        //ID(0) , PWD(x)  >> 실패  (비번다시 입력)
        
        //ID(x) , PWD(x)  >> 실패  (다시 입력해)
        //ID(x) , PWD(0)
        
        //Scanner 사용해서  ID, PWD 입력받으세요
        //loginmap 통해서 검증 로직 처리
        //ID 또는  PWD 틀리면 다시 입력 요청
        //ID , PWD 다 맞으면 회원님 방문 환영합니다 ^^ (출력 프로그램 종료)
        //ID 는 대소문자 구분없이 처리 합니다.
 */
class loginSystem {
	
	public loginSystem() {

	}
	
//	public boolean CheckId() {
//새로짜기
//	}
//}

public class Ex13_ {
		public static void main(String[] args) {
		       HashMap loginmap = new HashMap();
		        loginmap.put("kim", "kim1004");
		        loginmap.put("scott", "tiger");
		        loginmap.put("lee", "kim1004");
		        
		        
		        
		        
		}
	
}
