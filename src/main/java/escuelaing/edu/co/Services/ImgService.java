package escuelaing.edu.co.Services;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ImgService implements MainServiceInterface {

    @Override
    public String GetHeader() {
        return "HTTP/1.1 200 OK\r\n"
                + "Content-Type: img/jpg\r\n"
                + "\r\n";
    }

    @Override
    public String GetResponse() {
        String body = "";
        try{
            Path file = new File("").toPath();
            body = Files.probeContentType(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return body;
    }
}
