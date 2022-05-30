package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method=RequestMethod.GET)
	// GET ������� /�� �������� �� �Ʒ� home() �Լ��� �����϶�
	public String home() {
		System.out.println("home");
		return null;
	}
	
}