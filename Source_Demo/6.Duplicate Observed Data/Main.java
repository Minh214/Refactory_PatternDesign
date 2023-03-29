public class Main {
    public static void main(String[] args) {
        DataModel dataModel = new DataModel();
        DataView dataView = new DataView();

        dataModel.addObserver(dataView);

        dataModel.setData(10);
        dataModel.setData(20);
        dataModel.setData(30);
    }
}