package work;

import java.net.MalformedURLException;
import java.util.List;

public interface WordReader {

    void readWithURL(String url, String fileName) throws MalformedURLException;
}
