package me.daaz.vapor.deathban;

import gnu.trove.map.TObjectIntMap;
import org.bukkit.entity.Player;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

public interface DeathbanManager {

    long MAX_DEATHBAN_TIME = TimeUnit.HOURS.toMillis(3);

    TObjectIntMap<UUID> getLivesMap();

    int getLives(UUID uuid);

    int setLives(UUID uuid, int amount);

    int addLives(UUID uuid, int amount);

    int takeLives(UUID uuid, int amount);

    double getDeathBanMultiplier(Player player);

    Deathban applyDeathBan(Player player, String reason);

    Deathban applyDeathBan(UUID uuid, Deathban deathban);

    void reloadDeathbanData();

    void saveDeathbanData();
}
