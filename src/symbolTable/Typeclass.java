package symbolTable;

public interface Typeclass {
	public boolean matches(Typeclass other);
	
	public int getSize();
}