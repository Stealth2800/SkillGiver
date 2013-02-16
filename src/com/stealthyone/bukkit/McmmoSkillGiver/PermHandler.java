package com.stealthyone.bukkit.McmmoSkillGiver;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class PermHandler {

	private BasePlugin plugin;
	
	public PermHandler(BasePlugin plugin) {
		this.plugin = plugin;
	}
	
	public boolean checkPerm(CommandSender sender, String permission) {
		return this.checkPerm(sender, permission, true);
	}
	
	public boolean checkPerm(CommandSender sender, String permission, boolean isNotify) {
		/**
		 * Checks if a specified player has a certain command
		 */
		if (sender.hasPermission(permission)) {
			//Has permission
			return true;
		} else {
			//Doesn't have permission
			if (isNotify) {
				//Notifies player if no permission
				sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
			}
			//Logs and returns
			plugin.log.info(sender.getName() + " was denied access to a command! (" + permission + ")");
			return false;
		}
	}
}
