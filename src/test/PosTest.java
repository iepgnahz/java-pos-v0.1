package test;

public class PosTest {
    @Test
    public void should_pos_can_print_receipt() throws Exception {
        String[] input = new String[]{
                "{\"barcode\":\"ITEM000000\",\"name\":\"可口可乐\",\"unit\":\"瓶\",\"price\":3.00}",
                "{\"barcode\":\"ITEM000000\",\"name\":\"可口可乐\",\"unit\":\"瓶\",\"price\":3.00}",
                "{\"barcode\":\"ITEM000000\",\"name\":\"可口可乐\",\"unit\":\"瓶\",\"price\":3.00}",
                "{\"barcode\":\"ITEM000000\",\"name\":\"可口可乐\",\"unit\":\"瓶\",\"price\":3.00}",
                "{\"barcode\":\"ITEM000000\",\"name\":\"可口可乐\",\"unit\":\"瓶\",\"price\":3.00}",
                "{\"barcode\":\"ITEM000001\",\"name\":\"雪碧\",\"unit\":\"瓶\",\"price\":3.00}",
                "{\"barcode\":\"ITEM000004\",\"name\":\"电池\",\"unit\":\"个\",\"price\":2.00}"
        };


    }
}
