package com.gmail.goosius.townycultures.listeners;

import java.util.Arrays;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import com.gmail.goosius.townycultures.TownyCultures;
import com.gmail.goosius.townycultures.metadata.TownMetaDataController;
import com.gmail.goosius.townycultures.settings.TownyCulturesSettings;
import com.gmail.goosius.townycultures.settings.Translation;
import com.palmergames.bukkit.towny.event.statusscreen.TownStatusScreenEvent;

/**
 * 
 * @author Goosius
 *
 */
public class TownyCulturesTownEventListener implements Listener {

	@SuppressWarnings("unused")
	private final TownyCultures plugin;
	
	public TownyCulturesTownEventListener(TownyCultures instance) {
		plugin = instance;
	}

	@EventHandler
	public void onTownStatusScreen(TownStatusScreenEvent event) {
		if (TownyCulturesSettings.isTownyCulturesEnabled())
	        event.addLines(Arrays.asList(Translation.of("status_town_culture", TownMetaDataController.getTownCulture(event.getTown()))));
	}
}
