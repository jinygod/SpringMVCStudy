package kr.co.softcampus.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.softcampus.beans.DataBean;
import kr.co.softcampus.beans.DataBean2;

@Controller
public class TestController {
	
	
	// 자동으로 형변환 되지 않기 때문에 무조건 String으로 받아줘야한다. 무조건 문자열로만 받을 수 있음.
	@GetMapping("/test1")
	public String test1(@RequestParam Map<String, String> map, @RequestParam List<String> data3) {
		String data1 = map.get("data1");
		String data2 = map.get("data2");
		String data33 = map.get("data3");
		
		System.out.printf("data1 : %s\n", data1);
		System.out.printf("data2 : %s\n", data2);
		System.out.printf("data33 : %s\n", data33);
		
		for(String str : data3) {
			System.out.printf("str : %s\n", str);
		}
		
		return "result";
	}
	
	// 정수형 데이터였는데도 잘 들어온다.
	@GetMapping("/test2")
	//	public String test2(@ModelAttribute DataBean bean1, @ModelAttribute DataBean2 bean2) {
	// @ModelAttribute 어노테이션은 생략이 가능하다. 아무것도 안 넣으면 ModelAttribute로 취급해준다.
	// 커맨드 객체라고 불림(Command Object) , 빈으로 주입받는 것이 여러가지 장점이 있음.
	public String test2(DataBean bean1, DataBean2 bean2) {
		
		System.out.printf("data1 : %d\n" , bean1.getData1());
		System.out.printf("data2 : %d\n" , bean1.getData2());
		
		for(int number1 : bean1.getData3()) {
			System.out.printf("data3: %d\n", number1);
		}
		
		System.out.printf("bean2.data1 : %d\n" , bean2.getData1());
		System.out.printf("bean2.data2 : %d\n" , bean2.getData2());
		
		return "result";
		
	}
}
