
public class TestLog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogEvent logOut = new LogEvent();
		logOut.writeln("Program started.");
		System.out.println("Hello World!");
		logOut.writeln("Program ended.");

		logOut.closeLog();
	}

}
