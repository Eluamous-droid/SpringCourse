package com.luv2code.springdemo.mvc;

import javax.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

  @RequestMapping("/showForm")
  public String showForm(Model model) {

    Customer customer = new Customer();

    model.addAttribute("customer", customer);

    return "customer-form";
  }

  @RequestMapping("/processForm")
  public String processForm(@Valid @ModelAttribute("customer") Customer customer,
      BindingResult br) {

    System.out.println("|" + customer.getLastName() + "|");

    if (br.hasErrors())
      return "customer-form";

    return "customer-confirmation";
    }

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
      
      StringTrimmerEditor stringTrimmer = new StringTrimmerEditor(true);
      
      dataBinder.registerCustomEditor(String.class, stringTrimmer);
    }
}
