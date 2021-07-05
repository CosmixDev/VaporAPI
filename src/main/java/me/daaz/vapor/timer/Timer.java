package me.daaz.vapor.timer;

import org.bukkit.plugin.IllegalPluginAccessException;

public abstract class Timer {

    public Timer(String name, long defaultCooldown) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public String getName() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public long getDefaultCooldown() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }
}
