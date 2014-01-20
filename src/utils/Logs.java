package utils;

public class Logs {

	private static String errorsLog = "";

	public Logs() {
	}
	
	// Vacia el log
	public static void clear() {
		errorsLog = "";
	}

	// Devuelve el listado de mensajes de error
	public static String getErrorsLog() {
		return errorsLog;
	}

	// Añade un mensaje de error nuevo
	public static String addError(String newLog) {
		return errorsLog += newLine(newLog);
	}

	private static String newLine(String newLog) {
		return newLog + "\n";
	}
}
