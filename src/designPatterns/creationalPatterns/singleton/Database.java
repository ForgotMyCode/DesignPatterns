package designPatterns.creationalPatterns.singleton;

public final class Database {
	
	private static Database instance = new Database();
	
	public static Database getInstance() {
		return instance;
	}
	
	private Database() {
		System.out.println("Database connection established!");
	}
	
	public void doSomethingWithDatabase() {
		System.out.println("Doing something with database...");
	}
}
