package kr.ro.bit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class GRADEcheck {

	static HashMap<Integer, GRADE> map = new HashMap<Integer, GRADE>(); // point
	static int count = 1;
	static Scanner scan = new Scanner(System.in);

	public static void addGrade() {
		GRADE grade = new GRADE();
		map.put(count, grade.input(grade));
		count++;
	}

	public static void deleteGrade() {
		System.out.print("���� �� ��ȣ �Է� : ");
		int num = Integer.parseInt(scan.nextLine());
//		int num = scan.nextInt();
		if(map.containsKey(num)) {
			map.remove(num);
			System.out.println("�����Ǿ����ϴ�.");
		} else {
			System.out.println("�߸��Է��ϼ̽��ϴ�. �ش� ������ �����ϴ�.");
		}
	}

	public static void printGrade() {
		 Set<Integer> set = map.keySet();
         System.out.println("��ȣ\t����\t�ڹ�\t���̼�\t���\t���");
         for (Integer number : set) {
            double math = map.get(number).getMath();
            double java = map.get(number).getJava();
            double python = map.get(number).getPython();
            double avg = map.get(number).getAvg();
            String you = map.get(number).getYou();
            System.out.printf("%s\t%.2f\t%.2f\t%.2f\t%s\n", number, math, java, python, you);
         }
	}

	public static void saveGrade() {
		File file = new File("grade.txt");
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void loadGrade() {
		File file = new File("grade.txt");
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream oos = new ObjectInputStream(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*
	 * �������� ���α׷� <1>�߰� <2>���� <3>��� <4>���� <5>�ε� <6>���� : �������� �Է��ϼ��� : �ڹ����� �Է��ϼ��� :
	 * ���̽����� �Է��ϼ��� : ���������� �߰��Ͽ����ϴ�. �������� ���α׷� <1>�߰� <2>���� <3>��� <4>���� <5>�ε� <6>���� :
	 * ��ȣ ���� �ڹ� ���̽� ��� ���
	 * 
	 */

	public static void main(String[] args) {
		GRADEcheck bc = new GRADEcheck();
		while (true) {
			System.out.println("�������� ���α׷�");
			System.out.print("<1>�߰� <2>���� <3>��� <4>���� <5>�ε� <6>���� : ");
			int choice = Integer.parseInt(scan.nextLine());
			
			switch (choice) {
			case 1:
				addGrade();
				break;
			case 2:
				deleteGrade();
				break;
			case 3:
				printGrade();
				break;
			case 4:
				saveGrade();
				break;
			case 5:
				loadGrade();
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
			System.out.println("���������ý����� �����մϴ�.");
		} // switch
	}// while

	// main

	private void save() {
		File file = new File("grade.txt");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);

			oos.writeObject(map);

			oos.close();
			fos.close();
		} catch (Exception e) {
			System.out.println("�����߻�!!!");
			e.printStackTrace();
		}
		System.out.println("����Ǿ����ϴ�.");
	}

	private void exit() {
		System.out.println("�ý����� �����մϴ�.");
		System.exit(0);
		scan.close();
	}

}// class
