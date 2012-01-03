package com.djdch.bukkit.permaworldgenerator.listener;

import org.bukkit.event.world.WorldInitEvent;

import com.djdch.bukkit.permaworldgenerator.PermaWorldGenerator;

/**
 * 
 * @author DjDCH
 */
public class WorldListener extends org.bukkit.event.world.WorldListener {
    /**
	 * 
	 */
    private PermaWorldGenerator plugin;

    /**
     * 
     * @param plugin
     */
    public WorldListener(PermaWorldGenerator plugin) {
        this.plugin = plugin;
    }

    /**
     * 
     * @param event
     */
    public void onWorldInit(WorldInitEvent event) {
        this.plugin.WorldInit(event.getWorld());
    }
}
