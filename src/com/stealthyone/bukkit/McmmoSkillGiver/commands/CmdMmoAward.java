package com.stealthyone.bukkit.McmmoSkillGiver.commands;

import com.stealthyone.bukkit.McmmoSkillGiver.BasePlugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CmdMmoAward implements CommandExecutor {

	private BasePlugin plugin;
	
	public CmdMmoAward(BasePlugin plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (args.length > 2) {
			return false;
		} else {
			plugin.methods.addAllLevels(args[0], Integer.valueOf(args[1]));
			sender.sendMessage(ChatColor.AQUA + "Successfully gave " + args[0] + ChatColor.DARK_AQUA + Integer.valueOf(args[1]) + ChatColor.AQUA + " levels!");
			return true;
		}
	}

}
