package shop.ChootayBikes.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import shop.ChootayBikes.Model.SpareParts;
import shop.ChootayBikes.Services.SparePartService;

@RequestMapping("/sparepart")
public class SparePartController {

    @Autowired
    SparePartService sparePartService;

    @RequestMapping("/addsparepart")
    public ModelAndView addsparepart(Model model){
        SpareParts spareParts = new SpareParts();
        model.addAttribute("spareparts",spareParts);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("spareParts");
        return modelAndView;
    }

    @PostMapping("/addnewspareparts")
    public String addnewspareparts(@ModelAttribute("spareparts") SpareParts sparepart){
        sparePartService.addSparePart(sparepart);
        return "redirect:/spareparts/";
    }

    @PutMapping("/updatesparepart/{id}")
    public void updatesparepart(@PathVariable int id, @RequestBody SpareParts spareParts)
    {
        sparePartService.updateSparePart(id, spareParts);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deletesparepart/{id}")
    public void deletesparepart(@PathVariable int id)
    {
        sparePartService.deleteSparePart(id);
    }
}
