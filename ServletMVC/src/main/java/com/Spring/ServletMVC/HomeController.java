package com.Spring.ServletMVC;
import com.Spring.ServletMVC.model.Alien;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(){
        System.out.println("home method called");
        return "index";
    }

    @RequestMapping ("add")
    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2")int num2, ModelAndView mv){
        System.out.println("add method called");
//        int num1= Integer.parseInt(req.getParameter("num1"));
//        int num2= Integer.parseInt(req.getParameter("num2"));
        int result = num1+num2;
        mv.addObject("res",result);
        mv.setViewName("result");
        System.out.println("result of "+num1+" and "+num2+": "+result);

        return mv;
    }


    @ModelAttribute("course")
    public String courseName(){
        return "java";
    }
    @RequestMapping ("addAlien")
    public String addAlien(@ModelAttribute Alien alien)//we can pass value in bractet of modelattribute like
            //@ModelAttribute("name") keep the name and value and be called as
            //also the modelattribute is not required if the object name can be used as name
    {

        System.out.println("addLien method called model att");
//        int num1= Integer.parseInt(req.getParameter("num1"));
//        int num2= Integer.parseInt(req.getParameter("num2"));
//        Alien alien = new Alien();
//        alien.setAid(aid);
//        alien.setAname(aname);
//        mv.addObject("alien",alien);
//        mv.setViewName("result");
//        System.out.println("result of "+num1+" and "+num2+": "+result);



        return "result";
    }
}
