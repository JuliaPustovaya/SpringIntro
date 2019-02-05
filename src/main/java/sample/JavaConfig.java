package sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class JavaConfig {
	@Bean
	public MessageProvider provider(){
		return new SimpleMessageProvider();
	}
	@Bean
	public MessageRender render(MessageProvider provider){
		return  new SimpleMessageRender(provider);
	}
}
