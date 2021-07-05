package me.daaz.vapor.timer.type;

import me.daaz.vapor.timer.PlayerTimer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.plugin.IllegalPluginAccessException;

public class GappleHandler extends PlayerTimer implements Listener {

    public GappleHandler(String name, long defaultCooldown) {
        super(name, defaultCooldown);
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    public void onPlayerConsume(PlayerItemConsumeEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }
}
