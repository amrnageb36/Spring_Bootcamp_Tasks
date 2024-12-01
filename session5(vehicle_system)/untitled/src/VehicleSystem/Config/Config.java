package VehicleSystem.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("VehicleSystem")
@PropertySource("classpath:application.properties")

public class Config {


}
