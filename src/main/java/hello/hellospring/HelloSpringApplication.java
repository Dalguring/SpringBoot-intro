package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args); // SpringApplication.run(실행할 클래스명) 실행 시 Annotation에 의해 내장 톰캣을 통해 웹서버를 자체적으로 띄움
		// IJ에서 자바를 통해 Build하지 않고 Gradle을 통해 빌드하는 케이스가 있으니 gradle 빌드 및 실행 설정을 IJ로 변경 
	}

}
