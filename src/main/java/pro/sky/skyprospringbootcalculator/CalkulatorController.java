package pro.sky.skyprospringbootcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalkulatorController {
    private CalkulatorService calkulatorService = new CalkulatorService();

    @GetMapping(path = "/calkulator")
    public String greetingsСalkulator() {
        return calkulatorService.greetingsСalkulator();
    }
}
