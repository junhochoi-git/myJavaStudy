package example_oop_polymorphism;

public class Buyer2 {
	int money=1000;
	int bonusPoint=0;
	//@ADD itemArr to save each p
	Product[] itemArr= new Product [10];
	int i =0;
	
	void buy(Product p ) {
		if(money<p.price) {
			System.out.println("������ �ܾ��� �����Ͽ� ������ ������ �� �����ϴ�.");
			return;
			
		}
		money -=p.price;
		bonusPoint+=p.bonusPoint;
		itemArr[i++]=p; // �ʱ� itemArr[0] = p; 
		System.out.println(p+"��/�� �����Ͽ����ϴ�.");
		
	}
	void summary() {
		int sum=0; 
		String itemList="";
		//iteration for
		for(int i =0; i<itemArr.length; i++) {
			if(itemArr[i]==null) break;
			
			sum+= itemArr[i].price;
			itemList+=itemArr[i]+", ";
		}
		//layout
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ���:"+sum+"�� �Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� "+itemList+"�Դϴ�.");
	}
	
}

