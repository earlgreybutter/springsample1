package com.dogfoot.sample.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dogfoot.sample.model.SearchVO;

@RestController
@RequestMapping("/api")
public class PostAPIController {

	@RequestMapping(method = RequestMethod.POST, path = "/postRequest")
	public SearchVO postRequest(@RequestBody SearchVO searchVO) {
		return searchVO;
	}
	
	@PostMapping(value = "/postMapping")
	public SearchVO postMapping(@RequestBody SearchVO searchVO) {
		return searchVO;
	}
}
