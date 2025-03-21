import javax.xml.ws.Endpoint;

public class ServicePublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/StringManipulationService", new StringManipulationServiceImpl());
        System.out.println("Service is running...");
    }
}
