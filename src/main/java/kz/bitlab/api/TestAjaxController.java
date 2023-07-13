package kz.bitlab.api;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/test")
public class TestAjaxController {

    @GetMapping(value = "/get-all")
    public List<String> textList(
            @RequestParam(name = "testName", required = false, defaultValue = "Altyn") String testName
    ) {
        List<String> list = new ArrayList<>();
        list.add("Hello " + testName);
        list.add("Hi " + testName);
        list.add("Bonjour " + testName);
        list.add("Salam " + testName);
        list.add("Shalom " + testName);

        return list;
    }

}
