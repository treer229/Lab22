package kr.or.bit;

//스택을 직접 구현 ㅎㄷㄷ;
//배열로 만들어랑 ㅜㅜㅜ; 오브젝트 배열로 만들어랑

public class MyStack {
	private int top; //값이 변한데요(point 개념? 커서 라네요)
	public Object[] stackarr;//데이따를 담을 공간
	private int count; //오브젝트 배열의 인덱스
	private int maxsize;
	//추가적으로 필요한 변수는 추가 가능ㅎㅎ; 뭘 알아야 하지 ㅎㅎ;
	
	public MyStack(int maxsize) {
		stackarr = new Object[maxsize];
		this.maxsize = maxsize;
	}
	
	//기능을 구현
	//1.스택 비어 있니?
	//2.너 꽉찼니?
	//3.자료 집어 넣어 push
	//4.자료 빼 pop
	
	public void pop() {
		System.out.println(stackarr[top-1]);
		stackarr[--top] = null;
	}
	
	public void push(Object data) {
		if(top > maxsize-1) {
			System.out.println("ㅗ");
//		count++;
//		stackarr[top++]=(count <= maxsize) ? data: 0;
		} else if (top <= maxsize) {
			stackarr[top++] = data;
		}
	}
	public boolean isEmpty() {
		boolean result = (top == 0) ? true:false;	
		return result;
	}

	public static void main(String[] args) {
		MyStack m = new MyStack(10);
		
		m.push(1);
		m.push(2);
		m.push(3);
		m.push(4);
		m.push(5);
		m.push(6);
		m.push(7);
		m.push(8);
		m.push(9);
		m.push(10);
		m.push(11);
		m.pop();
		m.pop();
		m.pop();
		m.pop();
		m.pop();
		m.pop();
		m.pop();
		m.pop();
		m.pop();
		m.pop();
		System.out.println("================");
		for(Object n : m.stackarr) {
			System.out.println(n);
		}		
		
		System.out.println(m.isEmpty());
	}
	
}
