package me.Tiernanator.Flight;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public class FlightMain extends JavaPlugin {

	@SuppressWarnings("unused")
	@Override
	public void onEnable() {
		
		// in runTaskTimer() first number is how long you wait the first time to
		// start it
		// the second is how long between iterations
		BukkitTask flight = new Flight(this)
				.runTaskTimer(this, 0, 1200);
		
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new ApplyFlightOnPlayerJoin(this), this);
		
		getCommand("toggleFlight").setExecutor(new FlightCommand(this));
	}

	@Override
	public void onDisable() {

	}

}
