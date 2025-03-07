import java.util.ArrayList;
import java.util.List;

public class EventManager {
	List<IEventListener> listeners = new ArrayList<>();

	public void subscribe(IEventListener listener) {
		listeners.add(listener);
	}

	public void unSubscribe(IEventListener listener) {
		listeners.remove(listener);
	}

	public void notify(String text) {
		for (IEventListener listener : listeners) {
			listener.notify(text);
		}
	}
}
