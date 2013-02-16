package com.stealthyone.bukkit.McmmoSkillGiver;

import java.util.logging.Logger;
import java.util.logging.Level;

public class LogManager {
	
	private static Logger logger = Logger.getLogger("minecraft");
	
	private BasePlugin plugin;
	
	public LogManager(BasePlugin plugin) {
		this.plugin = plugin;
	}
	
	public void debug(String s) {
		if (plugin.isDebug() == true) {
			logger.log(Level.INFO, "[SkillGiver DEBUG] " + s);
		}
	}	
	
	public void info(String s) {
		logger.log(Level.INFO, "[SkillGiver] " + s);
	}
	
	public void warning(String s) {
		logger.log(Level.WARNING, "[SkillGiver] " + s);
	}
	
	public void severe(String s) {
		logger.log(Level.SEVERE, "[SkillGiver] " + s);
	}
	
}
