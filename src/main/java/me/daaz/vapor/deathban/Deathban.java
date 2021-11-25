package me.daaz.vapor.deathban;

import me.daaz.vapor.utils.PersistableLocation;
import me.daaz.vapor.utils.mongo.Mongoable;
import org.bson.Document;
import org.bukkit.Location;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.Map;

public class Deathban implements ConfigurationSerializable, Mongoable {

    private final String reason;
    private final long creationMillis;
    private final long expiryMillis;
    private final PersistableLocation deathPoint;

    public Deathban(String reason, long duration, PersistableLocation deathPoint) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public Deathban(Document document) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public Deathban(Map<String, Object> map) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @Override
    public Map<String, Object> serialize() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @Override
    public Document toDocument() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    /**
     * Gets the initial duration of this {@link Deathban} in milliseconds.
     *
     * @return the initial duration
     */
    public long getInitialDuration() {
        return this.expiryMillis - this.creationMillis;
    }

    /**
     * Checks if this {@link Deathban} is active.
     *
     * @return true if is active
     */
    public boolean isActive() {
        return this.getRemaining() > 0L;
    }

    /**
     * Gets the remaining time in milliseconds until this {@link Deathban} is no longer active.
     *
     * @return the remaining time until expired
     */
    public long getRemaining() {
        return this.expiryMillis - System.currentTimeMillis();
    }

    /**
     * Gets the {@link Location} where this player died during {@link Deathban}.
     *
     * @return death {@link Location}
     */

    public String getReason() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public long getCreationMillis() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public Location getDeathPoint() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public long getExpiryMillis() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }
}
