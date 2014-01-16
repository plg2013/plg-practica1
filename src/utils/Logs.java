package utils;

public class Logs {

	private static String symbolTableLog = "";
	private static String heapLog = "";
	private static String errorsLog = "";

	public Logs() {

	}

	public static String getSymbolTableLog() {
		return symbolTableLog;
	}

	public static String getHeapLog() {
		return heapLog;
	}

	public static String getErrorsLog() {
		return errorsLog;
	}

	public static String addToSymbolTableLog(String newLog) {
		return symbolTableLog.concat(newLine(newLog));
	}

	public static String addToHeapLog(String newLog) {
		return heapLog.concat(newLine(newLog));
	}

	public static String addToErrorsLog(String newLog) {
		return errorsLog.concat(newLine(newLog));
	}

	private static String newLine(String newLog) {
		return newLog + "\n";
	}
}
