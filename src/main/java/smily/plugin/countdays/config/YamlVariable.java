package smily.plugin.countdays.config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import smily.plugin.countdays.PluginUtils;

@JsonIgnoreProperties(ignoreUnknown = true)
public class YamlVariable {
    private PluginConfig pluginConfig = PluginUtils.context.getBean(PluginConfig.class);
    public Integer score;

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
        pluginConfig.writeAll();
    }

}
