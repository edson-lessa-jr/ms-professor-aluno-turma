package aula.cfserverconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CfServerConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(CfServerConfigApplication.class, args);
    }

}
