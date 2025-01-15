package helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person(String name, int age, Address address){ };
record Address(String firstline, String city){ };

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Boo";
    }

    @Bean
    public int age() {
        return 29;
    }

    @Bean
    public Person person() {
        return new Person("pathi", 20, new Address("mainRoad", "Chennai"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3) {
        return new Person(name, age, address3);
    }

    @Bean
    @Primary
    public Person person4Parameters(String name, int age, Address address4) {
        return new Person(name, age, address4);
    }

    @Bean(name = "address2")
    public Address address() {
        return new Address("BackStreet", "london");
    }
    @Bean(name = "address3")
    public Address address3() {
        return new Address("HSN", "BLR");
    }
    @Bean(name = "address4")
    @Primary
    public Address address4() {
        return new Address("silk town", "Bangalore");
    }


}


