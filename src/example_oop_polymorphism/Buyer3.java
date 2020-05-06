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
			System.out.println("고객님의 잔액이 부족하여 물건을 구매할 수 없습니다.");
			return;
			
		}
		money -=p.price;
		bonusPoint+=p.bonusPoint;
		item.add(p); // 초기 itemArr[0] = p; 
		System.out.println(p+"을/를 구입하였습니다.");
		
	}
	void refund(Product p) {
		if(item.remove(p)) {
			money+=p.price;
			bonusPoint -=p.bonusPoint;
			System.out.println(p+"을/를 반품하였습니다.");
		}else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	void summary() {
		int sum=0; 
		String itemList="";
		//~isEmpty
		if(item.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		//iteration for
		for(int i =0; i<item.size(); i++) {
			Product p= (Product)item.get(i);
			sum+=p.price;
			itemList+= (i==0)? (""+p) : (", "+p);
		}
		//layout
		System.out.println("구입하신 물품의 총 금액은:"+sum+"원 입니다.");
		System.out.println("구입하신 제품은 "+itemList+"입니다.");
	}
}
