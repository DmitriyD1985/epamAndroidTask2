import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Data> dataList = new ArrayList<Data>();
        dataList.add(new Data(1, "C"));
        dataList.add(new Data(1, "A"));
        dataList.add(new Data(2, "D"));
        dataList.add(new Data(1, "E"));
        dataList.add(new Data(2, "B"));

        for (Data d : sorter(dataList)) {
            System.out.printf(d.toString());
        }
    }

    public static List<Data> sorter(List<Data> dataList) {
        return dataList.stream().sorted(
                Comparator.comparing(Data::getNumber).thenComparing(Data::getName)
        ).collect(Collectors.toList());

    }
}
