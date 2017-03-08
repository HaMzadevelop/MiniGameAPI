package me.iHDeveloper.debug;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;

public class Debug {

	public static void send(String prefix, String message){
		ConsoleCommandSender console = Bukkit.getConsoleSender();
		console.sendMessage(color(prefix+" "+message));
	}
	
	private static String color(String format){
		return ChatColor.translateAlternateColorCodes('&', format);
	}
	
}
