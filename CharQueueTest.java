package assignment2;

public class CharQueueTest {
	
	public static void main(String[] args) {
		StringBuilder bldr = new StringBuilder();
		CharQueue set = new CharQueueImpl(bldr);
		
		System.out.println(set.isempty()); //T
		
		set.enQueue('a'); //add a
		set.enQueue('b'); //add b
		set.enQueue('c'); //add c
		set.enQueue('c'); //add c
		
		System.out.println(set.deQueue()); //a
		System.out.println(set.isempty()); //F
		
		System.out.println(set.remove('c')); //T
		System.out.println(set.remove('c')); //T
		System.out.println(set.remove('c')); //F
		
		System.out.println(set.deQueue()); //b
		
	}
	
}