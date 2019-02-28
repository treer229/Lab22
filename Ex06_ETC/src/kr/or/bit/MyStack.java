package kr.or.bit;

//������ ���� ���� ������;
//�迭�� ������ �̤̤�; ������Ʈ �迭�� ������

public class MyStack {
	private int top; //���� ���ѵ���(point ����? Ŀ�� ��׿�)
	public Object[] stackarr;//���̵��� ���� ����
	private int count; //������Ʈ �迭�� �ε���
	private int maxsize;
	//�߰������� �ʿ��� ������ �߰� ���ɤ���; �� �˾ƾ� ���� ����;
	
	public MyStack(int maxsize) {
		stackarr = new Object[maxsize];
		this.maxsize = maxsize;
	}
	
	//����� ����
	//1.���� ��� �ִ�?
	//2.�� ��á��?
	//3.�ڷ� ���� �־� push
	//4.�ڷ� �� pop
	
	public void pop() {
		System.out.println(stackarr[top-1]);
		stackarr[--top] = null;
	}
	
	public void push(Object data) {
		if(top > maxsize-1) {
			System.out.println("��");
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
