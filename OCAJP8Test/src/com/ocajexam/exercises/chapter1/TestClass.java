package com.ocajexam.exercises.chapter1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Currency;
import java.util.Locale;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestClass {

	public static void main(String[] args) throws IOException {
		Files.createDirectories(Paths.get("logs"));
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMdd_hhmm");
		LocalDateTime now = LocalDateTime.now();
		String date = now.format(df);
		
//		String logFileName = "logs\\testlog-" + date + ".txt";
//		FileHandler myFileHandler = new FileHandler(logFileName);
//		myFileHandler.setFormatter(new SimpleFormatter());
		
		Logger ocajLogger = Logger.getLogger("OCAJ Logger");
//		ocajLogger.setLevel(Level.ALL);
//		ocajLogger.addHandler(myFileHandler);
//		ocajLogger.info("\nThis is a logged information message. ");
//		myFileHandler.close();
		
//		System.out.println(Paths.get("folder gsdfg.java"));
//		System.out.println(Locale.CANADA.getLanguage());
//		System.out.println(Locale.GERMANY.getLanguage());
//		System.out.println(Currency.getAvailableCurrencies());
		try {
			Files.walk(Paths.get("logs")).forEach(p -> {
				if (p.getFileName().toString().endsWith("txt")) {
					System.out.println("Text doc: " + p.getFileName());
				}
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
