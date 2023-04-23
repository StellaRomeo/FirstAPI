package FirstAPI.FirstAPI.firstAPI05.CarController;

import FirstAPI.FirstAPI.firstAPI05.CarDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarController {
    @GetMapping(value = "/car")
    public CarDTO getCar(){
        CarDTO car = new CarDTO("1","Ford",99000);
        return car;
    }

    @PostMapping(value = "/createCar")
    public ResponseEntity<?> createCar(@RequestBody CarDTO car){
        System.out.println(createCar(car).toString());
        return ResponseEntity.status(HttpStatus.CREATED).body("Car created successfully");
    }

    @ExceptionHandler
    public ResponseEntity<String> handleException(Exception e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }
}
