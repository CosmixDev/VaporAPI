package me.daaz.vapor.user;

import gnu.trove.map.TObjectIntMap;
import gnu.trove.map.TObjectLongMap;
import me.daaz.vapor.deathban.Deathban;
import me.daaz.vapor.factions.type.PlayerFaction;
import me.daaz.vapor.kit.Kit;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class FactionUser implements ConfigurationSerializable {

    private final Set<UUID> factionChatSpying;
    private UUID userUUID;
    private boolean capzoneEntryAlerts;
    private boolean showClaimMap;
    private boolean showLightning;
    private Deathban deathban;
    private long lastFactionLeaveMillis;
    private TObjectIntMap<UUID> kitUseMap;
    private TObjectLongMap<UUID> kitCooldownMap;
    private int kills;
    private int deaths;
    private long lastRevive = 0;
    private UUID lastRepliedTo;
    private long lastSpeakTimeMillis;
    private long lastReceivedMessageMillis;
    private long lastSentMessageMillis;
    private long reclaimTimeLeft;
    private long reviveTimeLeft;
    private boolean reclaimed;
    private boolean foundOreVisible;
    private boolean scoreboardVisible;
    private boolean messagesVisible;
    private boolean potionCounterVisible;
    private boolean deathMessagesVisible;
    private boolean teamInfoVisible;
    private boolean claimInfoVisible;
    private PlayerFaction focused;
    private String name;

    public String getName() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public void setName(String name) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    private String prefix;

    private boolean hasPrefix;

    public void setPrefix(String prefix) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public void setHasPrefix(boolean hasPrefix) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public String getPrefix() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean hasPrefix() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public int getDeaths() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public void setDeaths(int deaths) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public FactionUser(UUID userUUID) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public FactionUser(Map<String, Object> map) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @Override
    public Map<String, Object> serialize() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public long getRemainingKitCooldown(Kit kit) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public void updateKitCooldown(Kit kit) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public int getKitUses(Kit kit) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public void incrementKitUses(Kit kit) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public void setLastRepliedTo(UUID lastRepliedTo) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public UUID getLastRepliedTo() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean isShowClaimMap() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    /**
     * Sets if this faction user if showing the claim map.
     *
     * @param showClaimMap if faction user should show claim map
     */
    public void setShowClaimMap(boolean showClaimMap) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public int getKills() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public void setKills(int kills) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public Deathban getDeathban() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public void setDeathban(Deathban deathban) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public void removeDeathban() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public void setLastFactionLeaveMillis(long lastFactionLeaveMillis) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean isShowLightning() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public void setShowLightning(boolean showLightning) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public Player getPlayer() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public long getReclaimTime() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean hasReclaimTime() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public void setReclaimTime(long time) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public long getReviveTime() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean hasReviveTime() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public void setReviveTime(long time) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public boolean isReclaimed() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public void setReclaimed(boolean reclaimed) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }
}
