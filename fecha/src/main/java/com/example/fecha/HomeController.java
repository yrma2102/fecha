package com.example.fecha;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	@RequestMapping("/")
    public String index() {
        return "index.jsp";
    }
	@RequestMapping("/date")
    public String date(Model model) {
		Date myDate = new Date();
		Locale locale = new Locale.Builder().setLanguage("es").setRegion("ES").build();
		model.addAttribute("date", new SimpleDateFormat("EEEE, dd 'de ' MMMMM , yyyy", locale).format(myDate));
        return "date.jsp";
    }
	@RequestMapping("/time")
    public String time(Model model) {
		Date myDate = new Date();
		model.addAttribute("hour",new SimpleDateFormat("h:mm a").format(myDate));
        return "time.jsp";
    }
}
