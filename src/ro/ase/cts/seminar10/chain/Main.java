package ro.ase.cts.seminar10.chain;

public class Main {

	public static void main(String[] args) {
		AbstractLogger loggerChain = LoggerChainFactory.getChainOfLoggers();
		
		loggerChain.logMessage(Verbosity.INFO, "This log is FYI");
		loggerChain.logMessage(Verbosity.ERROR, "Something went wrong");
		loggerChain.logMessage(Verbosity.FILE, "This if file message");
		loggerChain.logMessage(Verbosity.DEBUG, "This is dummy data");

	}

}
