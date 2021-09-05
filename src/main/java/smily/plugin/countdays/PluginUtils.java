package smily.plugin.countdays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import jakarta.validation.constraints.NotNull;

public class PluginUtils {
    @NotNull
    public static final ApplicationContext context = new AnnotationConfigApplicationContext(PluginAnnotationConfig.class);
}
