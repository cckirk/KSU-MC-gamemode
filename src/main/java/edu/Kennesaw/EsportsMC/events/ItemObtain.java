package edu.Kennesaw.EsportsMC.events;

import edu.Kennesaw.EsportsMC.Main;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.inventory.CraftItemEvent;

public class ItemObtain implements Listener {

    Main plugin;

    public ItemObtain(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void pickupItem(EntityPickupItemEvent e) {
        Entity entity = e.getEntity();
        if (entity instanceof Player p) {
            // Player Pickup Item Event
        }
    }

    @EventHandler
    public void craftItem(CraftItemEvent e) {
        // Player Craft Item Event
    }
}
