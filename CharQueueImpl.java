package assignment2;

public class CharQueueImpl implements CharQueue {
	private StringBuilder bldr;
	public CharQueueImpl(StringBuilder builderIn) {
		bldr = builderIn;
	}
	
	@Override
	public char deQueue() {
		if(bldr.length() == 0) {
			return (char)0;
		}else {
			char c = bldr.charAt(0);
			bldr.deleteCharAt(0);
			return c;
		}
	}
	
	@Override
	public void enQueue(char c) {
		bldr.append(""+c);
	}
	
	@Override
	public boolean isempty() {
		if(bldr.length() == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean remove(char c) {
		if(bldr.indexOf(""+c) >= 0) {
			bldr.deleteCharAt(bldr.indexOf(""+c));
			return true;
		}else {
			return false;
		}
	}
}