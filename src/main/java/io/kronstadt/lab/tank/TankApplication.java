package io.kronstadt.lab.tank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class TankApplication
{
  public static void main(String[] args)
  {
    SpringApplication.run(TankApplication.class, args);
  }
}
