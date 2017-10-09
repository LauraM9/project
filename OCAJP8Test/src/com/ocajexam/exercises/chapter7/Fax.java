package com.ocajexam.exercises.chapter7;

import java.io.File;

public interface Fax {
	public void sendFax(File f, int number);
	public Object getReceivedFaxes();
}
