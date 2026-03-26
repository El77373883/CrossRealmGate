package me.crossrealmgate;

import org.bukkit.entity.Player;

public class GateAPI {
    
    public boolean isBedrockPlayer(Player player) {
        return player.getName().startsWith(".");
    }
    
    public String getRealName(Player player) {
        String name = player.getName();
        return name.startsWith(".") ? name.substring(1) : name;
    }
}
