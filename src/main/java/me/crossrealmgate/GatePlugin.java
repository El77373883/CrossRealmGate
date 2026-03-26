package me.crossrealmgate;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class GatePlugin extends JavaPlugin {
    
    private static GatePlugin instance;
    
    @Override
    public void onEnable() {
        instance = this;
        
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage("§8╔══════════════════════════════════════════════════════════════╗");
        Bukkit.getConsoleSender().sendMessage("§8║  §b██████╗  █████╗ ████████╗███████╗                       §8║");
        Bukkit.getConsoleSender().sendMessage("§8║  §b██╔══██╗██╔══██╗╚══██╔══╝██╔════╝                       §8║");
        Bukkit.getConsoleSender().sendMessage("§8║  §b██████╔╝███████║   ██║   █████╗                         §8║");
        Bukkit.getConsoleSender().sendMessage("§8║  §b██╔══██╗██╔══██║   ██║   ██╔══╝                         §8║");
        Bukkit.getConsoleSender().sendMessage("§8║  §b██████╔╝██║  ██║   ██║   ███████╗                       §8║");
        Bukkit.getConsoleSender().sendMessage("§8║  §b╚═════╝ ╚═╝  ╚═╝   ╚═╝   ╚══════╝                       §8║");
        Bukkit.getConsoleSender().sendMessage("§8║                                                              §8║");
        Bukkit.getConsoleSender().sendMessage("§8║  §7Version §a1.0.0  §8•  §7Autor §bsoyadrianyt001               §8║");
        Bukkit.getConsoleSender().sendMessage("§8║  §7Puerta de autenticación para jugadores Bedrock              §8║");
        Bukkit.getConsoleSender().sendMessage("§8╚══════════════════════════════════════════════════════════════╝");
        Bukkit.getConsoleSender().sendMessage("§8[§b✦ CrossRealmGate§8] §a✔ Puerta abierta correctamente.");
        Bukkit.getConsoleSender().sendMessage("");
        
        getServer().getServicesManager().register(GateAPI.class, new GateAPI(), this, ServicePriority.Normal);
    }
    
    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§8[§b✦ CrossRealmGate§8] §c✘ Puerta cerrada.");
    }
    
    public static GatePlugin getInstance() {
        return instance;
    }
}
