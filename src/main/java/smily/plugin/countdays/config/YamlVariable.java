package smily.plugin.countdays.config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class YamlVariable {
    private Integer cooldown;

    public YamlVariable(Integer cooldown){
        this.cooldown = cooldown;
    }

    public YamlVariable(){}

    public Integer getCooldown() {
        return cooldown;
    }

    public void setCooldown(Integer cooldown) {
        this.cooldown = cooldown;
    }
}
