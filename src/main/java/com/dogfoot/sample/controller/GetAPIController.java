package com.dogfoot.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dogfoot.sample.model.SearchVO;

@RestController
@RequestMapping("/api")
public class GetAPIController {

	@RequestMapping(method = RequestMethod.GET, path = "/getRequest")
	public String getRequest() {
		return "this is getRequest";
	}
	
	/*
	@GetMapping("/getParameters")
	public String getParameters(@RequestParam String id, @RequestParam String email) {
		return "아이디는 " +id+ " 이메일은 " +email; 
	}
	*/
	
	@GetMapping("/getParameters")
	public String getParameters(@RequestParam (name = "id") String userId, @RequestParam (name="email") String userEmail) {
		return "아이디는 " +userId+ " 이메일은 " +userEmail; 
	}

	@GetMapping("/getMultiParameters")
	public String getMultiParameters(SearchVO searchVO) {
		return "VO 사용 아이디는 " + searchVO.getId() + " 이메일은 " + searchVO.getEmail();
	}
	
	@GetMapping("/getMultiParametersRtnJson")
	public SearchVO getMultiParametersRtnJson(SearchVO searchVO) {
		return searchVO;
	}
}
