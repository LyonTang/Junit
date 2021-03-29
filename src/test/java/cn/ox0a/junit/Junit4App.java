package cn.ox0a.junit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1. 如果作为jar包，在main/java中最好不要有main函数，与发布无关的请编写在test/java目录
 * 2. 作为服务，务必有main函数在main/java中
 * 这里作为spring test的启动环境，演示springboot环境下jar包的单元测试
 */
@SpringBootApplication
public class Junit4App {
	public static void main(String[] args) {
		SpringApplication.run(Junit4App.class, args);
	}
}
