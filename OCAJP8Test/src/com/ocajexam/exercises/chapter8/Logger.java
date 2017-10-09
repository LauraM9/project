package com.ocajexam.exercises.chapter8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
	private BufferedWriter out;

	public Logger() throws IOException {
		File f = new File("C:\\Users\\laura.miclescu\\Documents\\Workspace_Neon\\OCAJP8Test\\logs\\logfile.txt");
		f.createNewFile();
		out = new BufferedWriter(new FileWriter(f));
	}
	
	public void appendToLog(Logable logable) throws IOException {
		out.write("Object history: " + logable.getInitInfo());
		out.newLine();
		out.write("Object log event: " + logable.getLogableEvent());
		out.newLine();
	}
	
	public void close() throws IOException {
		out.flush();
		out.close();
	}
	
}
