package inheritance2;

public class CustomerManager {
	public void add(Logger logger) {
		//Adding Customer Codes
		System.out.println("Customer added");
	/*
	Do not use like this code structore becuase void function like above can not use anoter void function or class.
	DatabaseLogger databaseLogger = new DatabaseLogger();
	*/
	logger.log();
	}
}
