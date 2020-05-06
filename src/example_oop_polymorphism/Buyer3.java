package example_oop_polymorphism;

import java.util.*;

public class Buyer3 {
	int money=1000;
	int bonusPoint=0;
	//@ADD itemArr to save each p
	//Product[] itemArr= new Product [10];
	//@Vector class
	Vector item = new Vector();
	//int i =0;
	
	void buy(Product p ) {
		if(money<p.price) {
			System.out.println("������ �ܾ��� �����Ͽ� ������ ������ �� �����ϴ�.");
			return;
			
		}
		money -=p.price;
		bonusPoint+=p.bonusPoint;
		item.add(p); // �ʱ� itemArr[0] = p; 
		System.out.println(p+"��/�� �����Ͽ����ϴ�.");
		
	}
	void refund(Product p) {
		if(item.remove(p)) {
			money+=p.price;
			bonusPoint -=p.bonusPoint;
			System.out.println(p+"��/�� ��ǰ�Ͽ����ϴ�.");
		}else {
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");
		}
	}
	void summary() {
		int sum=0; 
		String itemList="";
		//~isEmpty
		if(item.isEmpty()) {
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}
		//iteration for
		for(int i =0; i<item.size(); i++) {
			Product p= (Product)item.get(i);
			sum+=p.price;
			itemList+= (i==0)? (""+p) : (", "+p);
		}
		//layout
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ���:"+sum+"�� �Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� "+itemList+"�Դϴ�.");
	}
}
