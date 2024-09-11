package edu.Kennesaw.EsportsMC.events;

import edu.Kennesaw.EsportsMC.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class EntityDeath implements Listener {

    Main plugin;

    public EntityDeath(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onEntityDeath(EntityDeathEvent e) {
        // Living entity has been killed
    }
}
