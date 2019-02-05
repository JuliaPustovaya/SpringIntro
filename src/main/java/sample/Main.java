package sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("context.xml");
		MessageRender render = context.getBean("render", MessageRender.class);
		render.render();
	}
}
