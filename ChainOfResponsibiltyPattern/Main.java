package ChainOfResponsibiltyPattern;

public class Main {
    public static void main(String[] args) {
        //auth -> logger -> compressor
        var encrpytor = new Encryptor(null);
        var compressor = new  Compressor(encrpytor);
        var logger = new Logger(compressor);
        var auth = new Authenticator(logger);
        var server = new WebServer(auth);
        server.handle(new HttpRequest("reaf", "1234"));
    }
}
