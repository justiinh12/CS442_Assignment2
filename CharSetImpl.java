package assignment2;
public class CharSetImpl implements CharSet {
	private StringBuilder bldr;
	public CharSetImpl(StringBuilder builderIn) {
		bldr = builderIn;
	}
	
	@Override
	public boolean addToSet(char e) {
		if(bldr.indexOf(e) >= 0) {
			return false;
		}else {
			bldr.append(e);
			return false;
		}
	}
	
	@Override
	public boolean deleteFromSet(char e) {
		if(bldr.indexOf(e) >= 0) {
			bldr.deleteCharAt(bldr.indexOf(e));
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public boolean setContains(char e) {
		if(bldr.indexOf(e) >= 0) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public int sizeOfSet() {
		return bldr.length();
	}
	
}