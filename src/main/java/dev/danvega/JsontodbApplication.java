package dev.danvega;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import dev.danvega.domain.User;
import dev.danvega.service.UserService;
@EnableJpaRepositories
@SpringBootApplication
public class JsontodbApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(JsontodbApplication.class, args);
	}
	@Bean
	CommandLineRunner runner(UserService userService)
	{
	    return args -> {
			//read JSON and load JSON
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<User>> typeReference = new TypeReference<List<User>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/users.json");
			try 
			{
				List<User> users = mapper.readValue(inputStream,typeReference);
				 System.out.println("Users: " + users.size());
	              User user = users.get(0);
	              System.out.println(user.toString());
				userService.save(users);
				System.out.println("Users Saved!");
			} 
			catch (IOException e)
			{
				System.out.println("Unable to Save Users: " + e.getMessage());
			}
	    };
	
    }
	}