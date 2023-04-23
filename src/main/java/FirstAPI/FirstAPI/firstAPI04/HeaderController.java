package FirstAPI.FirstAPI.firstAPI04;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/*
scrivi un'applicazione Spring Boot con le dipendenze necessarie che abbia:
un HeaderController che:
è mappato headers
restituisce il nome host e la porta host utilizzando le intestazioni della richiesta
testare l'endpoint API conPostman
 */

@RestController
public class HeaderController {


 @GetMapping("/headers")
    public String getHeader(@RequestHeader HttpHeaders headers){
        String host= headers.getHost().getHostName();
        int port= headers.getHost().getPort();
        return "host: "+ host + " - port: " + port;
    }



   //method 2
    @GetMapping(value = "/getHeaders")
    public String getServerName(HttpServletRequest request) {
        return request.getServerName() + ", "+ request.getServerPort();
    }
}
