import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
@JsonSerialize
public class WriterToJson {

    public void write(Class cl, String fileName) {
        ObjectMapper objectMapper = new ObjectMapper();
        Person person = new Person(12, "nam", Sex.SPIDERMAN, 36.6);

    }
}
