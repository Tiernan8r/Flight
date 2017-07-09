package me.Tiernanator.Flight;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Tiernanator.Colours.Colour;

public class FlightCommand implements CommandExecutor {

	@SuppressWarnings("unused")
	private FlightMain plugin;
	
	ChatColor warning;
	ChatColor good;
	ChatColor informative;
	
	public FlightCommand(FlightMain main) {
		plugin = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		warning = Colour.WARNING.getColour();
		good = Colour.GOOD.getColour();
		informative = Colour.INFORMATIVE.getColour();
		
		if(!(sender instanceof Player)) {
			sender.sendMessage(warning + "You can't use this command.");
			return false;
		}
		Player player = (Player) sender;
		
		if(player.getGameMode() == GameMode.CREATIVE && player.getAllowFlight()) {
			player.sendMessage(good + "You are in " + informative + "Creative" + good + " mode, you can already fly?!");
			return false;
		}
		
		if(player.getAllowFlight()) {
			player.setAllowFlight(false);
			player.setFlying(false);
			player.sendMessage(good + "Flight toggled (off).");
		} else {
			player.setAllowFlight(true);
			player.sendMessage(good + "Flight toggled (on).");
		}
		
		return true;
	}

}
