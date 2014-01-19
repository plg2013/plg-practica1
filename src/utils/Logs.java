package utils;

public class Logs {

	private static String errorsLog = "";

	public Logs() {
	}
	
	public static void clear() {
		errorsLog = "";
	}

	public static String getErrorsLog() {
		return errorsLog;
	}

	public static String addError(String newLog) {
		return errorsLog += newLine(newLog);
	}

	private static String newLine(String newLog) {
		return newLog + "\n";
	}
}
