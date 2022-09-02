package fastcampus.projectboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class FastCampusProjectBoard3Application {

    public static void main(String[] args) {
        SpringApplication.run(FastCampusProjectBoard3Application.class, args);
    }

}
