package me.daaz.vapor.timer.type;

import me.daaz.vapor.timer.PlayerTimer;
import me.daaz.vapor.timer.events.TimerCooldown;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.UUID;

public class HomeHandler extends PlayerTimer implements Listener {

    public HomeHandler(String name, long defaultCooldown) {
        super(name, defaultCooldown);
    }

    public Location getDestination(Player player) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @Override
    public TimerCooldown clearCooldown(UUID uuid) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public int getNearbyEnemies(Player player, int distance) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean teleport(Player player, Location location, long millis, PlayerTeleportEvent.TeleportCause cause) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public void cancelTeleport(Player player, String reason) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    public void onPlayerMove(PlayerMoveEvent event) {
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
