package jp.co.sunseer.sunseerservice.sunseerprj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan(basePackages = "jp.co.sunseer.sunseerservice.sunseerprj.mapper")
@EnableAutoConfiguration

public class sunseerprjApplication {
	public static void main(String[] args) {

		SpringApplication.run(sunseerprjApplication.class, args);
	}

}
