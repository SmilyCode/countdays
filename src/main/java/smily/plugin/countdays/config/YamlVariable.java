package smily.plugin.countdays.config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class YamlVariable {
    private Integer score;

    public YamlVariable(Integer score){
        this.score = score;
    }

    public YamlVariable(){}

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
