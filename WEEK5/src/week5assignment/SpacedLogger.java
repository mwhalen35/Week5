package week5assignment;



public class SpacedLogger implements Logger {

	@Override
	public void Log(String Log) {
		System.out.println();
		
	}

	@Override
	public void Error(String Error) {
	System.out.println("Error: " + Error.charAt(0) + " " + Error.charAt(1)+ " " + Error.charAt(2) + " " + Error.charAt(3) +  " " + Error.charAt(4));	
}


}