package smily.plugin.countdays;

import org.bukkit.plugin.java.JavaPlugin;

import smily.plugin.countdays.config.PluginConfig;

public final class CountDays extends JavaPlugin {

    private final PluginConfig pluginConfig = new PluginConfig();

    @Override
    public void onEnable() {
        pluginConfig.createDefaultConfig();
        pluginConfig.load();
    }

    @Override
    public void onDisable() {
        pluginConfig.writeAll();
        pluginConfig.override();
    }
}
