package edge.labs.leaderboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
@EnableRedisRepositories
public class SpringRedisSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRedisSampleApplication.class, args);
	}
}
