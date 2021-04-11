package me.Tiernanator.Flight;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class ApplyFlightOnPlayerJoin implements Listener {

	public ApplyFlightOnPlayerJoin(FlightMain main) {
	}

	/*
	 * This class as the name suggests, applies a previously registered group to the 
	 * player when they log on , if it's their first time, they are by default added to 
	 * group 1
	 */
	@EventHandler
	public void applyFactionOnPlayerJoin(PlayerJoinEvent event) {
		
		
		// get the player
		Player player = (Player) event.getPlayer();
		
		if(player.getGameMode() == GameMode.CREATIVE) {
			return;
		}
		
		if (player.hasPermission("player.fly")) {
			player.setAllowFlight(true);
		} else {
			player.setAllowFlight(false);
		}
	}

}
