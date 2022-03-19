package leavesdecayhandler.leavesdecayhandler;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.LeavesDecayEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class LeavesDecayHandler extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onLeavesDecayEvent(LeavesDecayEvent event){
        event.setCancelled(true);
    }
}
