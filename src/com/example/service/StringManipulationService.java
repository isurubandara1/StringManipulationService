import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface StringManipulationService {
    
    @WebMethod
    public String reverseText(String text);

    @WebMethod
    public int countCharacters(String text);
}
