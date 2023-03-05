package juniq.scg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class TwoController {
    @GetMapping("/two")
    String two() {
        return "two";
    }
}
