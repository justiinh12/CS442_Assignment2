package assignment2;
public interface CharSet {
	boolean addToSet(char e);
	boolean deleteFromSet(char e);
	boolean setContains(char e);
	int sizeOfSet();
}