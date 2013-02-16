package com.stealthyone.bukkit.McmmoSkillGiver.commands;

import java.util.List;

import com.stealthyone.bukkit.McmmoSkillGiver.BasePlugin;

import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CmdMmoAward implements CommandExecutor {

	private BasePlugin plugin;
	
	public CmdMmoAward(BasePlugin plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!plugin.perm.checkPerm(sender, "skillgiver.award")) {
			return true;
		}
		
		if (args.length > 2) {
			return false;
		} else if (args.length == 0) {
			return false;
		} else {
			//Check to see if levels is an integer
			int levels;
			try {
				levels = Integer.valueOf(args[1]);
			} catch (NumberFormatException e) {
				sender.sendMessage(ChatColor.RED + "Levels must be an integer!");
				return true;
			}
			
			//Refine player name
			List<Player> matchedPlayers = plugin.getServer().matchPlayer(args[0]);
			OfflinePlayer player = null;
			if (matchedPlayers.size() == 0) {
				sender.sendMessage(ChatColor.RED + "Giving levels to offline player");
				player = plugin.getServer().getOfflinePlayer(args[0]);
			} else if (matchedPlayers.size() == 1) {
				player = matchedPlayers.get(0);
			} else {
				sender.sendMessage(ChatColor.DARK_RED + args[0] + ChatColor.RED + " matches multiple online players!");
				return true;
			}
			
			plugin.methods.addAllLevels(player.getName(), levels);
			sender.sendMessage(ChatColor.AQUA + "Successfully gave " + player.getName() + " " + ChatColor.DARK_AQUA + levels + ChatColor.AQUA + " levels!");
			return true;
		}
	}

}
