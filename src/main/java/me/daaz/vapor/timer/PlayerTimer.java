package me.daaz.vapor.timer;

import com.google.common.base.Predicate;
import me.daaz.vapor.timer.events.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.UUID;

public abstract class PlayerTimer extends Timer {

    public PlayerTimer(String name, long defaultCooldown) {
        this(name, defaultCooldown, true);
    }

    public PlayerTimer(String name, long defaultCooldown, boolean persistable) {
        super(name, defaultCooldown);
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public void onExpire(UUID userUUID) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    public void onTimerExpireLoadReduce(TimerExpireEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public void clearCooldown(Player player) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public TimerCooldown clearCooldown(UUID playerUUID) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean hasTimer(Player player, Timer timerType) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean isPaused(Player player) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean isPaused(UUID playerUUID) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public void setPaused(UUID playerUUID, boolean paused) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean hasCooldown(UUID userUUID) {
        return this.getRemaining(userUUID) > 0L;
    }

    public boolean hasCooldown(Player player) {
        return this.getRemaining(player) > 0L;
    }

    public long getRemaining(Player player) {
        return this.getRemaining(player.getUniqueId());
    }

    public long getRemaining(UUID playerUUID) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean setCooldown(Player player, UUID playerUUID) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean setCooldown(Player player, UUID playerUUID, long duration, boolean overwrite) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean setCooldown(Player player, UUID playerUUID, long duration, boolean overwrite, Predicate<Long> currentCooldownPredicate) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }
}
