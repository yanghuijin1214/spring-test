package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
public class EmpController {

    @RequestMapping(value="/")
    public String home(Locale locale, Model model){
        Date date= new Date();
        DateFormat dateFormat=DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG,locale);
        String formattedDate=dateFormat.format(date);

        model.addAttribute("serverTime",formattedDate);
        return "home";
    }

}
