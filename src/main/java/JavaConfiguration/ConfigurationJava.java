package JavaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:calculator-properties")
public class ConfigurationJava {
    @Bean
    public PlusService plusService() {
        return new PlusService();
    }

    @Bean
    public MinusService minusService() {
        return new MinusService();
    }

    @Bean
    public Calculator calculator() {
        return new Calculator(minusService(), plusService());
    }
}
