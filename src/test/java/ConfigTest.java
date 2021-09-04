import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import org.junit.jupiter.api.Test;

public class ConfigTest {
    private final ObjectMapper obj = new ObjectMapper(new YAMLFactory());
    private final File configFile = new File("src/test/resources/config.yml");
    private YamlVariableTest yamlVar = new YamlVariableTest();


    @Test
    void createConfig(){
        if (!configFile.isFile()){
            System.out.println("Creating file config to store your data score there.");
        }
        try {
            if (configFile.createNewFile()){
                System.out.println("Creating config.");
            } else {
                System.out.println("File already created.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        load();

        System.out.println(isAnyValueNull());
    }

    @Test
    void load(){
        
        try 
        {
            yamlVar = obj.readValue(configFile, YamlVariableTest.class);
            System.out.println(yamlVar.toString()); 
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void set(){
        yamlVar = new YamlVariableTest();
        yamlVar.setScore(1);

        try {
            obj.writeValue(configFile, yamlVar);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isAnyValueNull(){
        Class<YamlVariableTest> yamlClass = YamlVariableTest.class;

        return Arrays.stream(yamlClass.getFields()).anyMatch(field -> {
            boolean nullExist = false;
            
            try {
                nullExist = field.get(yamlVar) == null;
                System.out.println(yamlVar);
            } catch (IllegalArgumentException | IllegalAccessException e) {
                e.printStackTrace();
            }
            return nullExist;
        });
    }

    
}
