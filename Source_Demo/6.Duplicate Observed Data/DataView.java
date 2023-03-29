import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

class DataView implements Observer {
    private List<Integer> dataList = new ArrayList<Integer>();

    public void update(Observable o, Object arg) {
        if (o instanceof DataModel) {
            DataModel dataModel = (DataModel) o;
            int data = (int) arg;
            dataList.add(data);
            System.out.println("Data added to list: " + data);
            System.out.println("Current data list: " + dataList);
        }
    }
}