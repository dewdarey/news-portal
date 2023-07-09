package kz.bitlab.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ModerController {

    @PreAuthorize("hasAnyRole('ROLE_MODER', 'ROLE_ADMIN')")
    @GetMapping(value = "/moder-panel")
    public String moderPanel(Model model) {
        return "moder";
    }
}
