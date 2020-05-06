package example_oop;

public class MemberCall {
	//member
	int iv =10;
	static int cv = 20;
	
	int iv2=cv;
	//static int cv = iv; // Error Ŭ���� ������ �ν��Ͻ� ������ ����Ҽ� ����.
	static int cv2 = new MemberCall().iv; //��ü�� �����ϰ� ������
	
	static void staticMethod1() { //Ŭ���� �޼ҵ� staticMethod1
		System.out.println(cv);
		//System.out.println(iv); // Error Ŭ���� �޼ҵ忡�� �ν��Ͻ� ���� ���Ұ�
		MemberCall c= new MemberCall();
		System.out.println(c.iv); // ��ü�� ������ �Ŀ��� ��� ����
	}
	
	//�ν��Ͻ� �޼ҵ�
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}
	
	//==============================
	static void staticMethod2() {
		staticMethod1();
		//instanceMethod1(); // ���� Ŭ�����޼ҵ忡���� �ν��Ͻ� �޼ҵ带 ȣ���Ҽ� ����
		MemberCall c = new MemberCall();
		c.instanceMethod1(); // �ν��Ͻ��� ������ �Ŀ��� ȣ���Ҽ�����
		
	}
	void instanceMethod2() { //�ν��Ͻ��޼ҵ忡���� �ν��Ͻ��޼ҵ�� Ŭ���� �޼ҵ�
		staticMethod1();  	 //��� �ν��Ͻ� �������� �ٷ� ȣ���� ����
		instanceMethod1();
		
	}
	
	
	
	
}
