package dev.norska.uar;

import org.bukkit.plugin.java.JavaPlugin;

public class UltimateAutoRestart extends JavaPlugin {
	
	private static UltimateAutoRestart instance;
	public UltimateAutoRestart() { instance = this; }
	public static UltimateAutoRestart getInstance() { return instance; }
	 
}
