package org.elmedievo.medievoutils.util.Methods;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class PlayerIsOnline {
    public static boolean playerIsOnline(String name, Boolean offlineInclusive) {
        if (!offlineInclusive) {
            Player player = Bukkit.getServer().getPlayer(name);
            return player != null;
        }
        return false;
    }
}
