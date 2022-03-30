package practice1;

public class ClassDemo1 {

	public static void main(String[] args) {
		
		ClassDemo1 obj = new ClassDemo1();
 Laddu myLaddu = new Laddu();
 
 System.out.println("Size of Laddu.." +myLaddu.size);
 
 obj.setsize(myLaddu.size);
 
 System.out.println("Size of laddu after passing.." +myLaddu.size);
 
 System.out.println("size of Laddu.."+myLaddu.size);
 
 obj.setsize(myLaddu);
 
 System.out.println("size of Laddu after passing.."+myLaddu.size);
 
	
 
	}
	void setsize (int size) {
		size = 5;
		
	}
	
	void setsize (Laddu laddu) {
		laddu.size = 5;
	}

}


class Laddu {
	
	int size = 20;
}
	


