package escuelaing.edu.co.Services;


import escuelaing.edu.co.HttpServer;

import java.io.IOException;

public class MainService {

    public static void main(String[] args) throws IOException{
        HttpServer server = HttpServer.getInstance();
        server.Services("/css", new CssService());
        server.Services("/html", new HtmlService());
        server.Services("/img", new ImgService());
        server.Services("/js", new JavaScriptService());
        server.main(args);
    }
}
