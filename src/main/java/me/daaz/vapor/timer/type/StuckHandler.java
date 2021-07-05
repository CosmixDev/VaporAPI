package me.daaz.vapor.timer.type;

import me.daaz.vapor.timer.PlayerTimer;
import me.daaz.vapor.timer.events.TimerCooldown;
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

public class StuckHandler extends PlayerTimer implements Listener {

    public StuckHandler(String name, long defaultCooldown, boolean persistable) {
        super(name, defaultCooldown, persistable);
    }

    public String getScoreboardPrefix() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @Override
    public TimerCooldown clearCooldown(UUID uuid) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @Override
    public boolean setCooldown(Player player, UUID playerUUID, long millis, boolean force) {
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

    public void run(Player player) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }
}
