package inheritance2;

public class DatabaseLogger extends Logger{
	@Override //override provides that class does not use extends class's codes.
	public void log() {
		System.out.println("Database logged");
	}
}
