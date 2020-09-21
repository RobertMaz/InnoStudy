import com.innopolis.MainMainMain;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class TestMain {
    @Test
    public void voidTest() {
        MainMainMain obj = Mockito.mock(MainMainMain.class);
        doNothing().when(obj).print();

        verify(obj, times(1)).print();
    }
}
