package me.daaz.vapor;

import me.daaz.vapor.timer.TimerManager;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

public class VaporAPI {

    public int getBalance(Player player) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public void removeBalance(Player player, int amount) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public TimerManager getTimerManager() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public int getKills(Player player) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public int getDeaths(Player player) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public int getKillstreak(Player player) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }
}
