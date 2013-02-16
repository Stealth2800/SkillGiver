package com.stealthyone.bukkit.McmmoSkillGiver;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

//import com.gmail.nossr50.api.ExperienceAPI;

public class PluginMethods {

	private BasePlugin plugin;
	
	public PluginMethods(BasePlugin plugin) {
		this.plugin = plugin;
	}
	
	public void addAllLevels(Player player, int levels) {
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
		
		Bukkit.dispatchCommand(plugin.getServer().getConsoleSender(), "addlevels " + player.getName() + " Excavation " + levels);
		Bukkit.dispatchCommand(plugin.getServer().getConsoleSender(), "addlevels " + player.getName() + " Fishing " + levels);
		Bukkit.dispatchCommand(plugin.getServer().getConsoleSender(), "addlevels " + player.getName() + " Herbalism " + levels);
		Bukkit.dispatchCommand(plugin.getServer().getConsoleSender(), "addlevels " + player.getName() + " Mining " + levels);
		Bukkit.dispatchCommand(plugin.getServer().getConsoleSender(), "addlevels " + player.getName() + " Woodcutting " + levels);
		Bukkit.dispatchCommand(plugin.getServer().getConsoleSender(), "addlevels " + player.getName() + " Axes " + levels);
		Bukkit.dispatchCommand(plugin.getServer().getConsoleSender(), "addlevels " + player.getName() + " Archery " + levels);
		Bukkit.dispatchCommand(plugin.getServer().getConsoleSender(), "addlevels " + player.getName() + " Swords " + levels);
		Bukkit.dispatchCommand(plugin.getServer().getConsoleSender(), "addlevels " + player.getName() + " Taming " + levels);
		Bukkit.dispatchCommand(plugin.getServer().getConsoleSender(), "addlevels " + player.getName() + " Unarmed " + levels);
		Bukkit.dispatchCommand(plugin.getServer().getConsoleSender(), "addlevels " + player.getName() + " Acrobatics " + levels);
		Bukkit.dispatchCommand(plugin.getServer().getConsoleSender(), "addlevels " + player.getName() + " Repair " + levels);
		
		if (player.isOnline()) {
			player.sendMessage(ChatColor.AQUA + "You were awarded " + ChatColor.DARK_AQUA + levels + ChatColor.AQUA + " levels in every mcMMO skill!");
		}
	}
}
