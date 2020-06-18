package me.spire.playerinfo;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class PlayerInfo extends JavaPlugin {

	@Override
	public void onEnable() {
		
	}
	
	@Override
	public void onDisable() {
		
	}
	
	
	public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
		
		if(command.getName().equalsIgnoreCase("pinfo")) {
			if(sender.hasPermission("playerinfo.use")) {
				if(args.length == 0) {
					sender.sendMessage("Please specify a user!");
				}
			

			else {
				Player target = Bukkit.getPlayer(args[0]);
			if(target != null) {
				sender.sendMessage(ChatColor.GOLD + target.getDisplayName() + "\'s info:\nWorld: " + target.getLocation().getBlock().getLocation().getWorld().getName() + "\nX: " + target.getLocation().getBlock().getLocation().getX() + "\nY: " + target.getLocation().getBlock().getLocation().getY() + "\nZ: " + target.getLocation().getBlock().getLocation().getZ());
				}
			else {
				sender.sendMessage("This user is not online!");
			}
			}
			
		}
		}
		
		
		return false;
	}
}

