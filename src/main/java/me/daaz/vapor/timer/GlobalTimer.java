package me.daaz.vapor.timer;

import org.bukkit.plugin.IllegalPluginAccessException;

public abstract class GlobalTimer extends Timer {

    public GlobalTimer(String name, long defaultCooldown) {
        super(name, defaultCooldown);
    }

    public boolean clearCooldown() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean isPaused() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public void setPaused(boolean paused) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public long getRemaining() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean setRemaining() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean setRemaining(long duration, boolean overwrite) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public long getRemaining1() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }
}
