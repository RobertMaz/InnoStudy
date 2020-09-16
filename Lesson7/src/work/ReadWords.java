package work;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.List;

public class ReadWords implements WordReader {
    List<String> list;

    @Override
    public void readWithURL(String url, String fileName) throws MalformedURLException {
        new Thread(() -> {
            try (FileOutputStream out = new FileOutputStream(fileName, true);
                 ReadableByteChannel readableByteChannel1 = Channels.newChannel(new URL(url).openStream())) {
                out.getChannel().transferFrom(readableByteChannel1, 0, Long.MAX_VALUE);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
