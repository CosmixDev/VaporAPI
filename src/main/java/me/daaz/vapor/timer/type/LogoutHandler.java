package me.daaz.vapor.timer.type;

import me.daaz.vapor.timer.PlayerTimer;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.UUID;

public class LogoutHandler extends PlayerTimer implements Listener {

    public LogoutHandler(String name, long defaultCooldown, boolean persistable) {
        super(name, defaultCooldown, persistable);
    }

    public ChatColor getScoreboardPrefix() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    private void checkMovement(Player player, Location from, Location to) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    public void onPlayerMove(PlayerMoveEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    public void onPlayerTeleport(PlayerTeleportEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    public void onPlayerKick(PlayerKickEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    public void onPlayerQuit(PlayerQuitEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    public void onPlayerDamage(EntityDamageEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @Override
    public void onExpire(UUID userUUID) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }
}
