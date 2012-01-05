package com.djdch.bukkit.permaworldgenerator.configuration;

import com.djdch.bukkit.permaworldgenerator.PermaWorldGenerator;
import com.djdch.bukkit.permaworldgenerator.generator.ChunkProviderGenerate;

/**
 * 
 * @author DjDCH
 */
public class WorldConfiguration {
    /**
	 *
	 */
    protected PermaWorldGenerator plugin;

    /**
	 *
	 */
    protected ChunkProviderGenerate chunkProvider;

    /**
	 *
	 */
    protected boolean init = false;

    /**
	 * 
	 */
    protected boolean levelStructures = false;

    /**
     * 
     * @param plug
     */
    public WorldConfiguration(PermaWorldGenerator plug) {
        this.plugin = plug;
    }

    /**
     * 
     * @return
     */
    public PermaWorldGenerator getPlugin() {
        return this.plugin;
    }

    /**
     * 
     * @return
     */
    public ChunkProviderGenerate getChunkProvider() {
        return this.chunkProvider;
    }

    /**
     * 
     * @param chunkProvider
     */
    public void setChunkProvider(ChunkProviderGenerate chunkProvider) {
        this.chunkProvider = chunkProvider;
    }

    /**
     * 
     * @return
     */
    public boolean isInit() {
        return this.init;
    }

    /**
     * 
     * @param isInit
     */
    public void setInit(boolean init) {
        this.init = init;
    }

    /**
     * 
     * @return
     */
    public boolean getLevelStructures() {
        return this.levelStructures;
    }

    /**
     * 
     * @param levelStructures
     */
    public void setLevelStructures(boolean levelStructures) {
        this.levelStructures = levelStructures;
    }
}
