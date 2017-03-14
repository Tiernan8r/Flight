package me.Tiernanator.Flight;

import org.bukkit.scheduler.BukkitRunnable;

public class Flight extends BukkitRunnable {

	@SuppressWarnings("unused")
	private Main plugin;

	public Flight(Main main) {
		plugin = main;
	}

	@Override
	public void run() {

//		Collection<? extends Player> onlinePlayers = plugin.getServer()
//				.getOnlinePlayers();
//
//		for (Player player : onlinePlayers) {
//			
//			if(player.getGameMode() == GameMode.CREATIVE) {
//				player.setAllowFlight(true);
//			} else if (player.hasPermission("player.fly")) {
//				
//				player.setAllowFlight(true);
//			} else {
//				player.setAllowFlight(false);
//			}
//		}
	}
}
