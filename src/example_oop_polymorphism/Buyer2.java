package example_oop_polymorphism;

public class Buyer2 {
	int money=1000;
	int bonusPoint=0;
	//@ADD itemArr to save each p
	Product[] itemArr= new Product [10];
	int i =0;
	
	void buy(Product p ) {
		if(money<p.price) {
			System.out.println("고객님의 잔액이 부족하여 물건을 구매할 수 없습니다.");
			return;
			
		}
		money -=p.price;
		bonusPoint+=p.bonusPoint;
		itemArr[i++]=p; // 초기 itemArr[0] = p; 
		System.out.println(p+"을/를 구입하였습니다.");
		
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
		System.out.println("구입하신 물품의 총 금액은:"+sum+"원 입니다.");
		System.out.println("구입하신 제품은 "+itemList+"입니다.");
	}
	
}

