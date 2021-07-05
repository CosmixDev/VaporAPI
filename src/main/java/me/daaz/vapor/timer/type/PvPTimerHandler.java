package me.daaz.vapor.timer.type;

import com.google.common.base.Predicate;
import me.daaz.vapor.factions.event.FactionClaimChangedEvent;
import me.daaz.vapor.factions.event.PlayerClaimEnterEvent;
import me.daaz.vapor.timer.PlayerTimer;
import me.daaz.vapor.timer.events.TimerClearEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockIgniteEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.entity.PotionSplashEvent;
import org.bukkit.event.player.PlayerBucketEmptyEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.spigotmc.event.player.PlayerSpawnLocationEvent;

import java.util.UUID;

public class PvPTimerHandler extends PlayerTimer implements Listener {

    public PvPTimerHandler(String name, long defaultCooldown) {
        super(name, defaultCooldown);
    }

    public long getTime() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @Override
    public void onExpire(UUID userUUID) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler
    public void onTimerStop(TimerClearEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.HIGHEST)
    public void onEntityDamage(EntityDamageEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    public void onClaimChange(FactionClaimChangedEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler
    public void onPlayerRespawn(PlayerRespawnEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.HIGH)
    public void onBucketEmpty(PlayerBucketEmptyEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.HIGH)
    public void onBlockIgnite(BlockIgniteEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.HIGH)
    public void onItemPickup(PlayerPickupItemEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler
    public void onPlayerSpawnLocation(PlayerSpawnLocationEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler
    public void onPlayerSpawnLocation2(PlayerRespawnEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler
    public void onPlayerClaimEnterMonitor(PlayerClaimEnterEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.HIGH)
    public void onPlayerClaimEnter(PlayerClaimEnterEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.NORMAL)
    public void onPotionSplash(PotionSplashEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean hasCooldown(Player player, UUID playerUUID, long duration, boolean overwrite, Predicate<Long> callback) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    private boolean canApply() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }
}
