package com.hardcoded.main;

import com.hardcoded.asset.ScrapMechanicAssetHandler;
import com.hardcoded.logger.Log;

public class Main {
	private static final Log LOGGER = Log.getLogger();
	
	public static void main(String[] args) throws Exception {
		// Init
		ScrapMechanicAssetHandler.getAllAssets();
		LOGGER.debug("testing: %s", "abcd");
	}
	
	public Main() {
//		World world;
//		try {
//			//world = World.loadWorldFromAppdata("TestingSQLite.db");
//			world = World.loadWorldFromAppdata("Survival/Amazing World.db");
//		} catch(Exception e) {
//			LOGGER.error("Failed to load world file");
//			LOGGER.throwing(e);
//			return;
//		}
//		
//		WorldHeader game = world.getWorldHeader();
//		LOGGER.info("Version: %d", game.getVersion());
//		LOGGER.info("Flags: %d", game.getFlags());
//		LOGGER.info("Seed: %d", game.getSeed());
//		LOGGER.info("Tick: %d", game.getGameTick());
//		
//		LOGGER.info("Mods:");
//		for(Mod mod : game.getMods()) {
//			LOGGER.info("    Mod: %s", mod);
//			LOGGER.info("      localId: %d", mod.localId);
//			LOGGER.info("      fileId : %d", mod.fileId);
//		}
	}
}
