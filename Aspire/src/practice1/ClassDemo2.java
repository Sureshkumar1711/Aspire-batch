package practice1;

public class ClassDemo2 {
	
	public static void main(String[] args) {
		
		int a[] = {10,20,30,40};
		
		System.out.println("Before Passing.."+a[0]);
		
			
		//new PassArray() .acceptArray(new int[] {10,20,30,40});
		
		int copya[]= new int[4];
		//for (int i = 0; i<a.length; i++) {
			//copya[i]= a[i];
		System.arraycopy(a, 0, copya, 0, a.length);
			
		new PassArray().acceptArray (copya);
		System.out.println("After Passing.."+a[0]);
		
	}

}

class PassArray{
	
	public void acceptArray(int a[]) {
		a[0] = 125;
		
	}
}