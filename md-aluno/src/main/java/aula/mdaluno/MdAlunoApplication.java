package aula.mdaluno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class MdAlunoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MdAlunoApplication.class, args);
    }

}
