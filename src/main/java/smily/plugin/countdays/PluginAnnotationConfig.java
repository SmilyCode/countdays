package smily.plugin.countdays;

import org.springframework.context.annotation.Bean;

import smily.plugin.countdays.config.PluginConfig;
import smily.plugin.countdays.config.YamlVariable;
import smily.plugin.countdays.event.DayCycleEvent;

public class PluginAnnotationConfig {
    @Bean
    public YamlVariable getYamlVariable(){
        return new YamlVariable();
    }
    
    @Bean
    public PluginConfig getPluginConfig(){
        return new PluginConfig();
    }

    @Bean
    public DayCycleEvent getDayCycleEvent(){
        return new DayCycleEvent();
    }
}
