package assignment2;
import java.util.ArrayList;

public class IntSetImpl extends ArrayList<Integer> implements IntSet {
	private static final long serialVersionUID = 5465283085896313084L;
	
	@Override
	public boolean addToSet(int e) {
		if(this.contains(e)) {
			return false;
		}else {
			this.add(e);
			return true;
		}
	}
	
	@Override
	public boolean deleteFromSet(int e) {
		if(this.contains(e)) {
			this.remove(Integer.valueOf(e));
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public boolean setContains(int e) {
		return this.contains(e);
	}
	
	@Override
	public int sizeOfSet() {
		return this.size();
	}
	
}