package littleproject;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.joda.time.LocalTime;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        User greeter = new User();
        System.out.println(greeter.sayHello());
    }
}