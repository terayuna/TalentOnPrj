package kr.talenton.web.controllers;

import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.talenton.web.dao.MemberDao;
import kr.talenton.web.vo.Member;

@Controller
@RequestMapping("/joinus/")
public class JoinusController {
	
	@Autowired
	private MemberDao memberDao;
	
	
	@RequestMapping(value="join", method=RequestMethod.GET)
	public String join(HttpSession session){
		
		return "joinus/join";
	}
	
	@RequestMapping(value="join", method=RequestMethod.POST)
	public String join(Member m) throws SQLException{
		
		memberDao.insert(m);
		return "redirect:/home/index"; //메인 화면으로 수정할 것
	}

	@RequestMapping(value = "login", method=RequestMethod.GET)
	public String login(){
		return "joinus/login";
	}
	
	@RequestMapping(value="upload", method=RequestMethod.GET)
	public String upload(HttpSession session){
		
		return "joinus/upload";
	}
	
}
