package shop.ChootayBikes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import shop.ChootayBikes.Model.UserLogin;
import shop.ChootayBikes.Repositories.BikesRepository;
import shop.ChootayBikes.Repositories.UserLoginRepository;

@SpringBootApplication
@EnableJpaRepositories
public class ChootayBikesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChootayBikesApplication.class, args);
	}

}
