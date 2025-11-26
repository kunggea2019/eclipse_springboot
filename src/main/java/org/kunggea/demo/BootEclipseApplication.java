package org.kunggea.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.kunggea.demo.mapper")
public class BootEclipseApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootEclipseApplication.class, args);
	}

}
