package week5assignment;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String Log) {
	System.out.println("***" + Log + "***");
		
	}

	@Override
	public void Error(String Error) {
		System.out.println("*****************");
		System.out.println("***ERROR:" + Error + "***");
		System.out.println("*****************");
	}

}
