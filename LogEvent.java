import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogEvent {
	//private String logFilePath;
	private String logFileName;
	private FileWriter fStream;
	private BufferedWriter out;
	
	public LogEvent() {
		Date now = new Date();
		SimpleDateFormat format_Date = new SimpleDateFormat("MMyyyy");
		logFileName = format_Date.format(now) + ".log";
		try {
			fStream = new FileWriter(logFileName,true);
			out = new BufferedWriter(fStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getLogFileName() {
		return logFileName;
	}
		
	public void writeln(String msg) {
		try {
			String nowString = DateFormat.getDateTimeInstance(
		            DateFormat.MEDIUM, DateFormat.SHORT).format(new Date());
			out.write('[' + nowString + "] " + msg + "\r\n");
						
		} catch (Exception e) {
			System.err.println("ERROR: " + e.getMessage());
		}
	}
	
	public void closeLog() {
		try {
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
