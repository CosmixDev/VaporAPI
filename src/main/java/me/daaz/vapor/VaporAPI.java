package me.daaz.vapor;

import me.daaz.vapor.deathban.Deathban;
import me.daaz.vapor.timer.TimerManager;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.UUID;

public class VaporAPI {

    public TimerManager getTimerManager() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public int getBalance(Player player) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public void removeBalance(Player player, int amount) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public int getKills(UUID uuid) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public int getDeaths(UUID uuid) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public int getLives(UUID uuid) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public int getKillStreak(OfflinePlayer player) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public Deathban getDeathban(UUID uuid) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }
}
