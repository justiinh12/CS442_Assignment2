package assignment2;

public class CharSetTest {
	public static void main(String[] args) { 
		StringBuilder bldr = new StringBuilder(); 
		CharSet set = new CharSetImpl(bldr);
		System.out.println(set.addToSet('e'));
		System.out.println(set.addToSet('f'));
		System.out.println(set.addToSet('e'));
		System.out.println(set.addToSet('g'));
		System.out.println(set.sizeOfSet());
		System.out.println(set.setContains('f'));
		System.out.println(set.deleteFromSet('f'));
		System.out.println(set.setContains('f'));
		System.out.println(set.deleteFromSet('f'));
		System.out.println(set.sizeOfSet()); 
	}
	/*true
	true
	false
	true
	3
	true
	true
	false
	false
	2*/
}