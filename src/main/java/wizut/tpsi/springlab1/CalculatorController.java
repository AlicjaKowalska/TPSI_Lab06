/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizut.tpsi.springlab1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author alicj
 */
@Controller
public class CalculatorController {

    @RequestMapping("/calculatorresult")
    public String calculatorresult(Model model, CalculatorForm calculate) {
        
        Integer X = calculate.getX();
        Integer Y = calculate.getY();
        String operation = calculate.getOperation();
        
        Integer result = 0;
        
        model.addAttribute("X", X);
        model.addAttribute("Y", Y);
        model.addAttribute("operation", operation);
        
        
        switch (operation) {
            case "+":
                result = X+Y;
                break;
            case "-":
                result = X-Y;
                break;
            case "*":
                result = X*Y;
                break;
        }
        
        model.addAttribute("result", result);

        return "calculatorresult";
    }
    
    /*@RequestMapping("/calculatorresult")
    public String calculatorresult(Model model, Integer X, Integer Y, String operation) {
        model.addAttribute("X", X);
        model.addAttribute("Y", Y);
        model.addAttribute("operation", operation);
        Integer result = 0;
        
        switch (operation) {
            case "+":
                result = X+Y;
                break;
            case "-":
                result = X-Y;
                break;
            case "*":
                result = X*Y;
                break;
        }
        
        model.addAttribute("result", result);

        return "calculatorresult";
        
    }*/
}
