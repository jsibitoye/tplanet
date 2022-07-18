package com.leh.tplanet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@Controller
public class TplanetApplication {

	public static void main(String[] args) {
		SpringApplication.run(TplanetApplication.class, args);
	}

	@GetMapping("/")
	public String indexPage (){
		return "index";
	}

	@RequestMapping("/converter")
	public String convertpage(){
		return "converter";
	}
	@PostMapping("/convert")
	public String convertpage(@ModelAttribute TimeInput tim, Model model){

		//System.out.println(tim.toString());
		model.addAttribute("actualTime", tim.toString());
		return "converter";
	}

	@RequestMapping("/staircase")
	public String 	staircasePage(){
		return "staircase";
	}

	@PostMapping("/stair")
	public String staircasePost(@ModelAttribute TaircaseClass stairClass , Model model){

		//System.out.println(stairClass.toString());
		String lader = stairClass.toString();
		model.addAttribute("lader", lader);
		return "staircase";
	}

	@RequestMapping("/arrayOfDigits")
	public String 	arrayOfDigitsPage(){
		return "arrayOfDigits";
	}

	@Autowired
	AddDigits addDigits ;

	@Bean
	public AddDigits getAddDigitsInstance(){
		return new AddDigits();
	}

	@PostMapping("/uniqueArray")
	public String uniqueArrayRender(@ModelAttribute DegitProcessing degitProcessing , Model model){

		//System.out.println(duplateRemove.toString());
		String Digitsum = degitProcessing.getUnique();

		try{
				Digitsum = addDigits.getSum(Digitsum);
		}
		catch(Exception e){
			Digitsum = "Invalid Input";
		}

		model.addAttribute("uniqueOutput", Digitsum);
		return "arrayOfDigits";
	}


}
