package kr.co.softcampus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.softcampus.beans.DataBean;

@Controller
public class TestController {

	@PostMapping("/test1")
	// public String test1(@ModelAttribute DataBean bean) {
	// 클래스 하나를 주입받을때 ModelAttibute가 붙는다. 생략가능.
	public String test1(DataBean bean) {
	//	System.out.printf("data1 : %s\n", bean.getData1());
	//	System.out.printf("data2 : %s\n", bean.getData2());
		
		return "test1";
	}
	
	// 리퀘스트영역 이름 저장가능
	@PostMapping("/test2")
	public String test2(@ModelAttribute("testData") DataBean bean) {
		return "test2";
	}
}
