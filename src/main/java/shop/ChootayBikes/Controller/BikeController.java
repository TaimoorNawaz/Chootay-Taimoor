package shop.ChootayBikes.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import shop.ChootayBikes.Model.Bike;
import shop.ChootayBikes.Services.BikeService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bike")
public class BikeController {

    @Autowired
    BikeService bikeService;


    @RequestMapping("/listbikes")
    public String viewHomePage(Model model){
        model.addAttribute("listBikes",bikeService.getAllBikes());
        return "index";
    }

    @RequestMapping("/bikes")
    public List<Bike> getAllBikes()
    {
        return bikeService.getAllBikes();
    }

    @RequestMapping("/addNewBike")
    public ModelAndView addNewBike(Model model){
        Bike bike = new Bike();
        model.addAttribute("bike",bike);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addBike");
        return modelAndView;
    }
    @PostMapping("/addBike")
    public String addBike(@ModelAttribute("bike") Bike bike){
        bikeService.addBike(bike);
        return "redirect:/bike/";
    }

    @PutMapping("/updateBike/{id}")
    public void updateBike(@PathVariable int id, @RequestBody Bike bike)
    {
        bikeService.updateBike(id, bike);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/bikes/{id}")
    public void deleteBike(@PathVariable int id)
    {
        bikeService.deleteBike(id);
    }
}
