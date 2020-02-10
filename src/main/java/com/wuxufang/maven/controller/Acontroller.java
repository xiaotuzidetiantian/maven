package com.wuxufang.maven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Acontroller {

	@RequestMapping("hello")
	public String hello() {
		return "hello";
	}
}
