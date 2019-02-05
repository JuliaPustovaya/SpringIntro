package sample;

import java.io.InputStream;
import java.util.Properties;

public class MessageFactory {
	private static MessageProvider provider;
	private static MessageRender render;

	public static MessageProvider getProvider() {
		return provider;
	}

	public static MessageRender getRender() {
		return render;
	}

	static {
		Properties properties = new Properties();
		try (InputStream in = MessageFactory.class
				.getClassLoader().getResourceAsStream("app.properties")) {
			properties.load(in);
			String messageRenderClass = properties.getProperty("messageRenderClass");
			String messageProvideClassr = properties.getProperty("messageProviderClass");

			provider = (MessageProvider) Class.forName(messageProvideClassr).newInstance();
			render = (MessageRender) Class.forName(messageRenderClass).getConstructor(MessageProvider.class).newInstance(provider);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
