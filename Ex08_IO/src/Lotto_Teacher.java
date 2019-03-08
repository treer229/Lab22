
import java.util.Random;
import java.util.Scanner;
	 
	//���赵
	//Lotto lotto = new Lotto();
	//lotto.SelectLottoNumber(); >> �޴� ����
	//1 ���� �Է� >> selectBasicNumber() �Լ� ȣ�� (�ǹ�ȣ ����) >> ���
	//2 ���� �Է� >> ȭ�鿡 ���.....
	//3 ���� �Է� >> ����
	public class Lotto_Teacher {
	    private Scanner scanner;
	    private Random r; // r.nextInt(45)+1 (1~45)
	    private int[] numbers;
	    private static final int no = 3; // �����Է� ����
	 
	    // static{} , {} �ʱ���
	    public Lotto_Teacher() { // Ư���� ����:member field �ʱ�ȭ :(������ �Լ�) , constructor
	        scanner = new Scanner(System.in); // �ʱ�ȭ (���� ���� �ּҰ��� ���°�)
	        r = new Random();
	        numbers = new int[6];
	    }
	 
	    // ����� �����غ����� (�Լ�)
	    // �Լ��ϳ��� ��� �ϳ�
	 
	    private String showMenu(Scanner scanner) {
	        System.out.println("*********************");
	        System.out.println("1. ��÷ ���� ��ȣ ����:");
	        System.out.println("2. ����.^^!");
	        System.out.println("*********************");
	        System.out.print("����� ���ϴ� ��ȣ�� ����:");
	        String selectionnum = scanner.nextLine();
	        return selectionnum;
	    }
	 
	    private void pickingNumber(Scanner scanner, int[] numbers, int no) {
	        int i = 0;
	        while (i <= no - 1) {
	            System.out.println(i + 1 + "��° ���ڸ� �Է��ϼ���");
	            numbers[i] = Integer.parseInt(scanner.nextLine());
	            for (int j = 0; j < i; j++) { // ���������� ��ü �񱳸� �ؾ� ��
	                if (numbers[i] == numbers[j]) {
	                    System.out.println("���� ���� �Է��߽��ϴ�. �ٽ� �Է��ϼ���");
	                    i--; // point
	                    break;
	                }
	            }
	            i++;
	        }
	    }
	 
	    public void selectLottoNumber() {
	        // �޴� ����....
	        escape: while (true) {
	            String selectionnum = showMenu(scanner);
	            switch (selectionnum) {
	            case "1":
	                pickingNumber(scanner, numbers, no); // 3���� ���� �Է�
	                selectBasicLottoNumber(r, numbers, no); // ����
	                showLottoNumbers(numbers); // ȭ�� ���
	                break;
	            case "2":
	                System.out.println("Good Lucky");
	                break escape; // escape �������� Ż��..
	            default:
	                System.out.println("Not Operation");
	                break;
	            }
	        }
	 
	    }
	 
	    private void selectBasicLottoNumber(Random r, int[] numbers, int no) {
	        // �Ƿζ� ��ȣ �����ϰ� �ߺ��� ���� ó�� �ϴ� �Լ�
	        for (int i = no; i < 6; i++) { // 3���� random ����
	            numbers[i] = r.nextInt(45) + 1; // ���� ����
	            for (int j = 0; j < i; j++) { // ���������� ��ü �񱳸� �ؾ� ��
	                if (numbers[i] == numbers[j]) {
	                    i--; // point
	                    break;
	                }
	            }
	        }
	    }
	 
	    private void showLottoNumbers(int[] numbers) {
	        for (int i = 0; i < numbers.length; i++) {
	            for (int j = i + 1; j < numbers.length; j++) {
	                if (numbers[i] > numbers[j]) {
	                    int temp = numbers[i];
	                    numbers[i] = numbers[j];
	                    numbers[j] = temp;
	                }
	            }
	        }
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.printf("[%2d]", numbers[i]);
	        }
	        System.out.println();
	    }
	 
	    // ����(��� �Լ�) (6���� ���� ���ؼ� 6���� ���� ����� ������ 5���� ũ�ų� ����
	    // 10���� �۰ų� ������ ��ȣ ����
	    // (avg >= 5 && avg <= 10) true ���� ... �� ������ �ƴϸ� �������ϰڴ�
	    private boolean checkAverage(int[] numbers) {
	        int sum = 0;
	        int average = 0;
	        for (int i = 0; i < numbers.length; i++) {
	            sum += numbers[i];
	        }
	        average = sum / numbers.length;
	        return (average >= 5 && average <= 10); // 5,6,7,8,9,10 >> true
	 
	    }
	 
	}

