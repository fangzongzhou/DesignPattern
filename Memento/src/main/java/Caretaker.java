import java.util.HashMap;

/**
 * 作为存储对象，将需要保存状态的对象存储在当前对象中
 */

public class Caretaker {

    private HashMap<String, Memento> mMap;

    public Caretaker() {
        mMap = new HashMap<String,Memento>();
    }

    public Memento getMemento(String state) {
        return mMap.get(state);
    }

    public void setMemento(Memento memento) {
        mMap.put(memento.state, memento);
    }
}
