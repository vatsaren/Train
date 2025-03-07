public class NewsPortal {
	public EventManager manager = new EventManager(); //не уверен что public это норм

	public void createNews(String text) {
		manager.notify(text);
	}
}
