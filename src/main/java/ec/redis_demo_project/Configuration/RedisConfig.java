package ec.redis_demo_project.Configuration;

import ec.redis_demo_project.SpringProperties.SpringDataProperties;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
@Log4j2
public class RedisConfig {

    private final SpringDataProperties springDataProperties;

    @Autowired
    public RedisConfig(SpringDataProperties springDataProperties) {
        this.springDataProperties = springDataProperties;
    }

    @Bean
    JedisConnectionFactory jedisConnectionFactory() {
        RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration(springDataProperties.getRedis()
                .getHost(), springDataProperties.getRedis().getPort());

        log.info("redis host: " + springDataProperties.getRedis()
                .getHost() + " and port: " + springDataProperties.getRedis().getPort());
        return new JedisConnectionFactory(configuration);
    }

    @Bean
    public RedisTemplate<String, Object> redisTemplate() {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(jedisConnectionFactory());
        return template;
    }
}
