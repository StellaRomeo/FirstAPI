package FirstAPI.FirstAPI.firstAPI02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/*
scrivi un'applicazione Spring Boot con le dipendenze necessarie che abbia:
a FactorialControllerdove si esegue la mappatura factorial per:
rispondere con il fattoriale della n variabile path passata con la GET richiesta
testare l'endpoint API con Postman, eseguendo una GETrichiesta
 */

@RestController
public class FactorialController {

    @GetMapping("/factorial/{n}")
    public long factorial(@PathVariable int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

}
