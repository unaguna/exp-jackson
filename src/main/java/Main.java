import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, Object> target = new HashMap<>();
        target.put("integer", 42);
        target.put("string", "foo");
        target.put("null", null);

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(System.out, target);
    }
}
