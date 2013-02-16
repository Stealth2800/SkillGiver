package com.stealthyone.bukkit.McmmoSkillGiver;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

//import com.gmail.nossr50.api.ExperienceAPI;

public class PluginMethods {

	private BasePlugin plugin;
	
	public PluginMethods(BasePlugin plugin) {
		this.plugin = plugin;
	}
	
	public void addAllLevels(String player, int levels) {
		//ExperienceAPI.addLevel(player, "Excavation", levels);
		//ExperienceAPI.addLevel(player, "Fishing", levels);
		//ExperienceAPI.addLevel(player, "Herbalism", levels);
		//ExperienceAPI.addLevel(player, "Mining", levels);
		//ExperienceAPI.addLevel(player, "Woodcutting", levels);
		//ExperienceAPI.addLevel(player, "Axes", levels);
		//ExperienceAPI.addLevel(player, "Archery", levels);
		//ExperienceAPI.addLevel(player, "Swords", levels);
		//ExperienceAPI.addLevel(player, "Taming", levels);
		//ExperienceAPI.addLevel(player, "Unarmed", levels);
		//ExperienceAPI.addLevel(player, "Acrobatics", levels);
		//ExperienceAPI.addLevel(player, "Repair", levels);
		
		Bukkit.dispatchCommand(plugin.getServer().getConsoleSender(), "addlevels " + player + " Excavation " + levels);
		Bukkit.dispatchCommand(plugin.getServer().getConsoleSender(), "addlevels " + player + " Fishing " + levels);
		Bukkit.dispatchCommand(plugin.getServer().getConsoleSender(), "addlevels " + player + " Herbalism " + levels);
		Bukkit.dispatchCommand(plugin.getServer().getConsoleSender(), "addlevels " + player + " Mining " + levels);
		Bukkit.dispatchCommand(plugin.getServer().getConsoleSender(), "addlevels " + player + " Woodcutting " + levels);
		Bukkit.dispatchCommand(plugin.getServer().getConsoleSender(), "addlevels " + player + " Axes " + levels);
		Bukkit.dispatchCommand(plugin.getServer().getConsoleSender(), "addlevels " + player + " Archery " + levels);
		Bukkit.dispatchCommand(plugin.getServer().getConsoleSender(), "addlevels " + player + " Swords " + levels);
		Bukkit.dispatchCommand(plugin.getServer().getConsoleSender(), "addlevels " + player + " Taming " + levels);
		Bukkit.dispatchCommand(plugin.getServer().getConsoleSender(), "addlevels " + player + " Unarmed " + levels);
		Bukkit.dispatchCommand(plugin.getServer().getConsoleSender(), "addlevels " + player + " Acrobatics " + levels);
		Bukkit.dispatchCommand(plugin.getServer().getConsoleSender(), "addlevels " + player + " Repair " + levels);
		 
		if (plugin.getServer().getPlayer(player) != null) {
			plugin.getServer().getPlayer(player).sendMessage(ChatColor.AQUA + "You were awarded " + ChatColor.DARK_AQUA + levels + ChatColor.AQUA + " levels in every mcMMO skill!");
		}
	}
}
