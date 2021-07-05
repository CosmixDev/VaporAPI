package me.daaz.vapor.timer.type;

import me.daaz.vapor.timer.PlayerTimer;
import me.daaz.vapor.timer.events.TimerCooldown;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.UUID;

public class EnderpearlHandler extends PlayerTimer implements Listener {

    public EnderpearlHandler(String name, long defaultCooldown) {
        super(name, defaultCooldown);
    }

    public String getScoreboardPrefix() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @Override
    public TimerCooldown clearCooldown(UUID playerUUID) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @Override
    public void clearCooldown(Player player) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public void refund(Player player) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler
    public void refund2(PlayerDeathEvent e) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    public void onProjectileLaunch(ProjectileLaunchEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }
}

