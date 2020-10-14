import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestMain {
    @Test
    public void testSorter() throws Exception {
        List<Data> dataList = new ArrayList<Data>();
        dataList.add(new Data(1, "C"));
        dataList.add(new Data(1, "A"));
        dataList.add(new Data(2, "D"));
        dataList.add(new Data(1, "E"));
        dataList.add(new Data(2, "B"));
        assertEquals("Data(number=1, name=A)\n", Main.sorter(dataList).get(0).toString());
        assertEquals("Data(number=1, name=C)\n", Main.sorter(dataList).get(1).toString());
        assertEquals("Data(number=1, name=E)\n", Main.sorter(dataList).get(2).toString());
        assertEquals("Data(number=2, name=B)\n", Main.sorter(dataList).get(3).toString());
        assertEquals("Data(number=2, name=D)\n", Main.sorter(dataList).get(4).toString());
    }
}
