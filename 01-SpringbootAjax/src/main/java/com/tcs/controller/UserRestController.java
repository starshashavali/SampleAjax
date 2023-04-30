package com.tcs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserRestController {

	@GetMapping("/")
	public String load() {
		return "index";
	}

	@GetMapping("/msg")
	@ResponseBody
	public String getMsg(@RequestParam("name") String name, Model model) {

		String msg = "hello," + name;
		model.addAttribute("msg", msg);
		return msg;
	}
	@GetMapping("/cmsg")
	@ResponseBody
	public String getDropdownMsg(@RequestParam("cname") String cname) {

		String msg = "I am going to ," + cname+"in next Year";
		return msg;
	}
	/*
	 * @RequestParam is a Spring annotation used to bind a web request parameter to
	 * a method parameter.
	 */
}
