package com.stealthyone.bukkit.McmmoSkillGiver;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import com.gmail.nossr50.api.ExperienceAPI;

public class PluginMethods {

	private BasePlugin plugin;
	
	public PluginMethods(BasePlugin plugin) {
		this.plugin = plugin;
	}
	
	public void addAllLevels(String playerName, int levels) {
		this.addAllLevels(plugin.getServer().getPlayer(playerName), levels);
	}
	
	public void addAllLevels(Player player, int levels) {
		ExperienceAPI.addLevel(player, "Excavation", levels);
		ExperienceAPI.addLevel(player, "Fishing", levels);
		ExperienceAPI.addLevel(player, "Herbalism", levels);
		ExperienceAPI.addLevel(player, "Mining", levels);
		ExperienceAPI.addLevel(player, "Woodcutting", levels);
		ExperienceAPI.addLevel(player, "Axes", levels);
		ExperienceAPI.addLevel(player, "Archery", levels);
		ExperienceAPI.addLevel(player, "Swords", levels);
		ExperienceAPI.addLevel(player, "Taming", levels);
		ExperienceAPI.addLevel(player, "Unarmed", levels);
		ExperienceAPI.addLevel(player, "Acrobatics", levels);
		ExperienceAPI.addLevel(player, "Repair", levels);
		if (player.isOnline()) {
			player.sendMessage(ChatColor.AQUA + "You were awarded " + ChatColor.DARK_AQUA + levels + ChatColor.AQUA + " levels in every mcMMO skill!");
		}
	}
}
