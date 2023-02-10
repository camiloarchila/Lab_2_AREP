package escuelaing.edu.co.Services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaScriptService implements MainServiceInterface {
    @Override
    public String GetHeader() {
        return "HTTP/1.1 200 OK\r\n"
                + "Content-Type: text/javascript\r\n"
                + "\r\n";
    }

    @Override
    public String GetResponse() {
        byte[] body = new byte[0];
        try{
            Path file = Paths.get("src/main/java/resources/JsFile.js");
            body = Files.readAllBytes(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(body);
    }
}
