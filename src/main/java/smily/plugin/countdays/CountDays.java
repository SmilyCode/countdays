package smily.plugin.countdays;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import smily.plugin.countdays.config.PluginConfig;
import smily.plugin.countdays.event.PlayerJoin;

public final class CountDays extends JavaPlugin {

    private PluginConfig pluginConfig;

    @Override
    public void onEnable() {
        pluginConfig = PluginUtils.context.getBean(PluginConfig.class);
        
        pluginConfig.createDefaultConfig();
        pluginConfig.load();

        Bukkit.getPluginManager().registerEvents(new PlayerJoin(), this);
    }

    @Override
    public void onDisable() {
        pluginConfig.writeAll();
        pluginConfig.override();
    }
}
