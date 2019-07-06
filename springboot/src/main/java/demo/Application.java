package demo;

import com.skm.common.mybatis.config.MybatisConfiguration;
import com.skm.common.spring.security.SecurityConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.configuration.Swagger2DocumentationConfiguration;

import java.util.Arrays;

@SpringBootApplication
@Import({SecurityConfiguration.class, MybatisConfiguration.class, Swagger2DocumentationConfiguration.class})
@ComponentScan(basePackages = {"com.skm.demo", "com.skm.common"})
public class Application {
    private static final Logger LOG = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext env = SpringApplication.run(Application.class, args);
        String[] activeProfiles = env.getEnvironment().getActiveProfiles();
        LOG.info("active profile: {}", Arrays.toString(activeProfiles));
    }
}
