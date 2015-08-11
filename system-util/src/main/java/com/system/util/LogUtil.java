package com.system.util;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogUtil {
	
	public static Logger getLogger() {
		Logger log = Logger.getLogger("infoLog");
		log.setLevel(Level.INFO);
		return log;
	}

}
