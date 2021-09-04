package smily.plugin.countdays;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

import jakarta.validation.constraints.NotNull;

public final class CountDaysManager{
    @NotNull
    private static Plugin plugin;

    public static Plugin getPlugin() {
        return plugin = Bukkit.getPluginManager().getPlugin("CountDay");
    }

    
}
