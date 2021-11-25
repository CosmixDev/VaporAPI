package me.daaz.vapor.user;

import me.daaz.vapor.Vapor;
import me.daaz.vapor.utils.Config;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;

public class UserManager implements Listener {

    private Vapor plugin;

    private static Pattern USERNAME_REGEX;

    protected Map<String, UUID> uuidCache;

    private Map<UUID, FactionUser> users;
    private Config userConfig;

    public UserManager() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
    public void onPlayerJoin(PlayerJoinEvent event) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    /**
     * Gets a map of {@link FactionUser} this manager holds.
     *
     * @return map of user UUID strings to their corresponding
     * {@link FactionUser}.
     */
    public Map<UUID, FactionUser> getUsers() {
        return users;
    }

    /**
     * Gets a {@link FactionUser} by their {@link UUID} asynchronously.
     *
     * @param uuid the {@link UUID} to get from
     * @return the {@link FactionUser} with the {@link UUID}
     */
    public FactionUser getUserAsync(UUID uuid) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public UUID fetchUUID(String username) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    public static void resetFlatData() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    /**
     * Gets a {@link FactionUser} by their {@link UUID}.
     *
     * @param uuid the {@link UUID} to get from
     * @return the {@link FactionUser} with the {@link UUID}
     */
    public FactionUser getUser(UUID uuid) {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    /**
     * Loads the user data from storage.
     */
    public void reloadUserData() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }

    /**
     * Saves the user data to storage.
     */
    public void saveUserData() {
        throw new IllegalPluginAccessException("VaporAPI not found");
    }
}
