package com.image.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imagegenerator")
public class ImageController {
	@GetMapping("do")
	public String resize() {
		return "Image has been resized";
	}

}
