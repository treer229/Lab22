import java.util.Stack;

public class Ex05_Stack {
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push("A");
		stack.push("B");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//System.out.println(stack.pop()); 자료가 없는데 팝하면 엠티스택 오류 뜬다 이말이야
		System.out.println(stack.isEmpty());
		stack.push(1);
		System.out.println(stack.isEmpty());
		
		//동전케이스 
		//stack 자료구조 원하는 형태....
		Stack<Coin> coinbox = new Stack<Coin>();
		coinbox.push(new Coin(10));
		coinbox.push(new Coin(50));
		coinbox.push(new Coin(500));
		coinbox.push(new Coin(100));
		
	//	System.out.println(coinbox.pop().getValue());
		while(!coinbox.isEmpty()) {
			Coin coin = coinbox.pop();
			System.out.println("꺼낸 동전 "+ + coin.getValue()+ "원");
		}
		
		
		
		
	}
}
