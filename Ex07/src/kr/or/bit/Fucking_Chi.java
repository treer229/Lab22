package kr.or.bit;

import java.util.ArrayList;

public class Fucking_Chi {
	public static void main(String[] args) {
		ArrayList chickenList = new ArrayList(10);
		ArrayList sportsList = new ArrayList();
		ArrayList rainList = new ArrayList();

		sportsList.add("�߱�");
		sportsList.add("�߱�");
		sportsList.add("�߱�");
		sportsList.add("����");
		sportsList.add("����");
		sportsList.add("����");
		sportsList.add("��");
		sportsList.add("����");
		sportsList.add("�߱�");
		sportsList.add("�߱�");

		rainList.add(false);
		rainList.add(false);
		rainList.add(false);
		rainList.add(false);
		rainList.add(true);
		rainList.add(false);
		rainList.add(true);
		rainList.add(false);
		rainList.add(false);
		rainList.add(false);
		
		if((boolean)rainList.get(0) == false) {
			System.out.println("Work");
		}
		
		
		for(int i =0; i<10; i++) {
			int chi = 30;
			chi	+= ((boolean)rainList.get(i)) ? -5 : 0;
			chi += (sportsList.get(i).equals("�߱�")) ? 20 : 0;
			chi += (sportsList.get(i).equals("��")) ? 5 : 0;
			chickenList.add(i, chi);
		}
		
		
		for(Object ob : chickenList) {
			System.out.println(ob);
		}
	}
}