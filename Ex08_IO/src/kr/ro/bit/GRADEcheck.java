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
		System.out.print("삭제 할 번호 입력 : ");
		int num = Integer.parseInt(scan.nextLine());
//		int num = scan.nextInt();
		if(map.containsKey(num)) {
			map.remove(num);
			System.out.println("삭제되었습니다.");
		} else {
			System.out.println("잘못입력하셨습니다. 해당 정보가 없습니다.");
		}
	}

	public static void printGrade() {
		 Set<Integer> set = map.keySet();
         System.out.println("번호\t수학\t자바\t파이선\t평균\t등급");
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
	 * 성적관리 프로그램 <1>추가 <2>삭제 <3>출력 <4>저장 <5>로드 <6>종료 : 수학점수 입력하세요 : 자바점수 입력하세요 :
	 * 파이썬점수 입력하세요 : 성적정보를 추가하였습니다. 성적관리 프로그램 <1>추가 <2>삭제 <3>출력 <4>저장 <5>로드 <6>종료 :
	 * 번호 수학 자바 파이썬 평균 등급
	 * 
	 */

	public static void main(String[] args) {
		GRADEcheck bc = new GRADEcheck();
		while (true) {
			System.out.println("성적관리 프로그램");
			System.out.print("<1>추가 <2>삭제 <3>출력 <4>저장 <5>로드 <6>종료 : ");
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
				System.out.println("잘못입력하셨습니다.");
			}
			System.out.println("성적관리시스템을 종료합니다.");
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
			System.out.println("에러발생!!!");
			e.printStackTrace();
		}
		System.out.println("저장되었습니다.");
	}

	private void exit() {
		System.out.println("시스템을 종료합니다.");
		System.exit(0);
		scan.close();
	}

}// class
