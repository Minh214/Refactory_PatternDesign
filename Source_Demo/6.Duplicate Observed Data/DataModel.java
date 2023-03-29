import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

// The observable class that holds the data
class DataModel extends Observable {
    private int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
        setChanged();
        notifyObservers(data);
    }
}
