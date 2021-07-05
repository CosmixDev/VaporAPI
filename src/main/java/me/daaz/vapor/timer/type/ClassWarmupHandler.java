package me.daaz.vapor.timer.type;

import me.daaz.vapor.pvpclass.utils.customenchants.events.ArmorEquipEvent;
import me.daaz.vapor.timer.PlayerTimer;
import me.daaz.vapor.timer.events.TimerCooldown;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.UUID;

public class ClassWarmupHandler extends PlayerTimer implements Listener {

    public ClassWarmupHandler(String name, long defaultCooldown) {
        super(name, defaultCooldown);
    }

    public void disable() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @Override
    public TimerCooldown clearCooldown(UUID playerUUID) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @Override
    public void onExpire(UUID userUUID) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    public void onPlayerKick(PlayerQuitEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    public void onPlayerJoin(PlayerJoinEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    public void onEquipmentSet(ArmorEquipEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    private void attemptEquip(Player player) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }
}
