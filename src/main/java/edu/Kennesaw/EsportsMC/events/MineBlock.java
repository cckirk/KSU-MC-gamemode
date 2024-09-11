package edu.Kennesaw.EsportsMC.events;

import edu.Kennesaw.EsportsMC.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class MineBlock implements Listener {

    Main plugin;

    public MineBlock(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        // Block Break Event
    }

}
