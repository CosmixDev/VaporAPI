package me.daaz.vapor.timer.type;

import me.daaz.vapor.timer.PlayerTimer;
import me.daaz.vapor.timer.events.TimerExpireEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.IllegalPluginAccessException;

public class ArcherHandler extends PlayerTimer implements Listener {

    public ArcherHandler(String name, long defaultCooldown) {
        super(name, defaultCooldown);
    }

    @EventHandler
    public void onExpire(TimerExpireEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler
    public void onHit(EntityDamageByEntityEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }
}
