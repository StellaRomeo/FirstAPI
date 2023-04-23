package FirstAPI.FirstAPI.firstAPI03;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
scrivi un'applicazione Spring Boot con le dipendenze necessarie che abbia:
un StringController che:
è mappato strings
restituisce la concatenazione di 2 stringhe (la prima è obbligatoria, la seconda no) params
gestire il caso in cui la seconda stringa è nulla (vogliamo restituire solo la prima stringa)
testare l'endpoint API con Postman, eseguendo 2 GETrichieste:
con solo il primo param
con entrambi i param
 */

@RestController
public class StringController {

    @GetMapping("/strings")
    public String getString(@RequestParam String string, String string2) {
        if(string2 == null) {
            return string;
        }else{
            return string + " " + string2;
        }
    }




}
