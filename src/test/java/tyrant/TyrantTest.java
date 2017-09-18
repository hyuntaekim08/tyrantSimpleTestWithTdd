package tyrant;

import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TyrantTest {
    @Test
    public void getRetrivedWhatWasPut() throws IOException{
//        Tyrant t = new Tyrant();
//        t.put("key", "value");
//        assertThat(t.get("key"), is("value"));
        TyrantMap map = new TyrantMap();
        map.open();
        map.put("key", "value");
        assertThat(map.get("key"), is("value".getBytes()));
        map.close();
    }

}
