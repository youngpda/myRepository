package com.my.springapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.model.ApiResponseMessage;

@RestController
public class HelloController {

//    @RequestMapping(value="/hello", method= RequestMethod.GET)
//    public String helloWorld() {
//        return "hello, World";
//    }

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	//@ApiOperation(value = "hello, World API", notes = "hello, World를 반환하는 API, Ajax 통신 확인용.")
	public ResponseEntity<ApiResponseMessage> helloWorld() {
		ApiResponseMessage message = new ApiResponseMessage("Success", "Hello, World", "", "");
		System.out.println("GIT..!!");
		return new ResponseEntity<ApiResponseMessage>(message, HttpStatus.OK);
	}

}
