package ec.redis_demo_project.SpringProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;

//@Component
@ConfigurationProperties(prefix = "spring.data")
public class SpringDataProperties {

    private final Redis redis = new Redis();

    public class Redis {
        private String host;
        private int port;

        public String getHost() {
            return this.host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public int getPort() {
            return this.port;
        }

        public void setPort(int port) {
            this.port = port;
        }
    }

    public Redis getRedis() {
        return this.redis;
    }

}
