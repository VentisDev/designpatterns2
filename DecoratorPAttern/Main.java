package DecoratorPAttern;

public class Main {
    public static void main(String[] args) {
        storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("1234-14234-1324-155");
    }
}