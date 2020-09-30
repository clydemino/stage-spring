package tn.esprit.folderrepository.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DepotController {

    @RequestMapping("/")
    public String welcome() {

        return "index";
    }

}
