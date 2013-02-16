package com.stealthyone.bukkit.McmmoSkillGiver.commands;

import com.stealthyone.bukkit.McmmoSkillGiver.BasePlugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CmdSkillGiver implements CommandExecutor {

	private BasePlugin plugin;
	
	public CmdSkillGiver(BasePlugin plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (args.length == 0) {
			if (!plugin.perm.checkPerm(sender, "skillgiver.version")) {
				return true;
			}
			sender.sendMessage(ChatColor.AQUA + plugin.getName() + " v" + plugin.getPlVersion());
			sender.sendMessage(ChatColor.DARK_AQUA + "By Stealth2800");
			sender.sendMessage(ChatColor.RED + "Type /skillgiver help for help");
			return true;
		} else if (args[0].equalsIgnoreCase("help")) {
			if (!plugin.perm.checkPerm(sender, "skillgiver.help")) {
				return true;
			}
			sender.sendMessage(ChatColor.AQUA + "General Plugin Info - /skillgiver");
			sender.sendMessage(ChatColor.AQUA + "Give All Levels to Player - /mmoaward <player> <number>");
			return true;
		} else {
			return true;
		}
	}

}
