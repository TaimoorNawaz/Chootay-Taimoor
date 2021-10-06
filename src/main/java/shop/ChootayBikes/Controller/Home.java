package shop.ChootayBikes.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/home")
public class Home {

    @GetMapping("/owner")
    public String user(){
        return "<h1>Welcome Owner<h1>";
    }

    @GetMapping("/manager")
    public String admin(){
        return "<h1>Welcome Manager<h1>";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
