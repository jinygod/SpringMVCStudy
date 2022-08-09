package kr.co.softcampus.beans;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class DataBean1 {
	
	@NotEmpty
	private String data1;
	
	@NotBlank
	private String data2;
	
	public DataBean1() {
		this.data1 = "abcd";
		this.data2 = "abcd";
	}
	
	public String getData1() {
		return data1;
	}

	public void setData1(String data1) {
		this.data1 = data1;
	}

	public String getData2() {
		return data2;
	}

	public void setData2(String data2) {
		this.data2 = data2;
	}
	
	
}
