package week5assignment;

public class App {

	public static void main(String[] args) {
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		
		asteriskLogger.Log("Hello");  // question 4
		asteriskLogger.Error("Hello"); // question 5
		spacedLogger.Log("Hello");
		spacedLogger.Error("Hello");
		
		
		

	}

}
