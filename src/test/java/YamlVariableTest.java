import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.NotNull;

@JsonIgnoreProperties(ignoreUnknown = true)
public class YamlVariableTest{

    @NotNull
    public Integer score;
    
    public String toString(){
        return "Your score is: " + score;
    }

    public Integer getScore() {
        return score;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
}
