package kr.talenton.web.controllers;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.talenton.web.dao.NoticeDao;
import kr.talenton.web.dao.ProductDao;
import kr.talenton.web.vo.Member;
import kr.talenton.web.vo.Notice;

@Controller
@RequestMapping("/myPage/myInformation/")
public class MyPageController {
	@RequestMapping("modifyInformation")
	public void modifyInformation(){
		
	}
	
}
