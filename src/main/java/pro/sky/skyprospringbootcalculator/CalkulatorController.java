package pro.sky.skyprospringbootcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calkulator")
public class CalkulatorController {
    private final CalkulatorServiceImpl calkulatorService;

    public CalkulatorController(CalkulatorServiceImpl calkulatorService) {
        this.calkulatorService = calkulatorService;
    }

    @GetMapping
    public String greetingsСalkulator() {
        return calkulatorService.greetingsСalkulator();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return calkulatorService.plus(num1, num2);
    }@GetMapping("/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return calkulatorService.minus(num1, num2);
    }@GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return calkulatorService.multiply(num1, num2);
    }@GetMapping("/divide")
    public String divide(@RequestParam double num1, @RequestParam double num2) {
        return calkulatorService.divide(num1, num2);
    }
}
