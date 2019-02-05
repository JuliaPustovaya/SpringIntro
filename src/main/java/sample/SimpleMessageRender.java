package sample;

public class SimpleMessageRender implements MessageRender {
	private final MessageProvider provider;

	public SimpleMessageRender(MessageProvider provider) {
		this.provider = provider;
	}

	@Override
	public void render() {
		System.out.println(provider.getMessage());
	}
}
