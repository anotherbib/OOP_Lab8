import java.util.ArrayList;
import java.util.List;

public abstract class Source {
    private final List<Subscriber> list = new ArrayList<>();

    public void add (Subscriber observer) {
        list.add(observer);
    }
    public void remove(Subscriber observer) {
        list.remove(list.indexOf(observer));
    }
    public void notifyObservers() {
        for (int j = 0; j < list.size(); ++j) {
            list.get(j).update(this);
	    }
    }
}
