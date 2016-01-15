package kr.talenton.web.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.talenton.web.dao.ProductDao;
import kr.talenton.web.vo.Product;

@Controller
@RequestMapping("/upload/")
public class UploadController {
	@Autowired
	private ProductDao productDao;
	
	
	@RequestMapping(value="uploadProduct", method=RequestMethod.GET)
	public String uploadProduct(){
		return "upload/uploadProduct";
	}
	
	@RequestMapping(value="uploadProduct", method=RequestMethod.POST)
	public String uploadProduct(Product p,Principal principal){
		
		p.setUpload_id(principal.getName());
		System.out.println("테스트시작");
		System.out.println(p.getCategory());
		System.out.println(p.getIntroduction());
		productDao.insert(p);
		
		
		return "redirect:/home/index"; //된다면 메인으로 바꾸기
	}

}