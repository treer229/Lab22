import java.util.Stack;

public class Ex05_Stack {
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push("A");
		stack.push("B");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//System.out.println(stack.pop()); �ڷᰡ ���µ� ���ϸ� ��Ƽ���� ���� ��� �̸��̾�
		System.out.println(stack.isEmpty());
		stack.push(1);
		System.out.println(stack.isEmpty());
		
		//�������̽� 
		//stack �ڷᱸ�� ���ϴ� ����....
		Stack<Coin> coinbox = new Stack<Coin>();
		coinbox.push(new Coin(10));
		coinbox.push(new Coin(50));
		coinbox.push(new Coin(500));
		coinbox.push(new Coin(100));
		
	//	System.out.println(coinbox.pop().getValue());
		while(!coinbox.isEmpty()) {
			Coin coin = coinbox.pop();
			System.out.println("���� ���� "+ + coin.getValue()+ "��");
		}
		
		
		
		
	}
}
