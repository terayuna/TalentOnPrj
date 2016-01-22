package kr.talenton.web.controllers;

import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.talenton.web.dao.MemberDao;
import kr.talenton.web.vo.Member;

@Controller
@RequestMapping("/joinus/")
public class JoinusController {
	
	@Autowired
	private MemberDao memberDao;
	
	
	@RequestMapping(value="searchId", method=RequestMethod.GET)
	public String searchId(HttpSession session){
		
		return "joinus/searchId";
	}
	
	@RequestMapping(value="searchId", method=RequestMethod.POST)
	public String searchId(String member_email, Model model){
		String member_id;
		
		System.out.println("이메일 :" + member_email);
		member_id = memberDao.searchId(member_email);
		System.out.println("아이디 :" + member_id);
		
		model.addAttribute("id", member_id);
		model.addAttribute("email", member_email);
		
		return "joinus/searchId";
	}
	
	@RequestMapping(value="searchPwd", method=RequestMethod.GET)
	public String searchPwd(HttpSession session){
		
		return "joinus/searchPwd";
	}
	
	@RequestMapping(value="searchPwd", method=RequestMethod.POST)
	public String searchPwd(String member_id, String member_email, Model model){
		String pwd;
		
		System.out.println("아이디 :" + member_id);
		System.out.println("이메일 :" + member_email);
		
		pwd = memberDao.searchPwd(member_id, member_email);
		
		System.out.println("비번 :" + pwd);
		model.addAttribute("id", member_id);
		model.addAttribute("email", member_email);
		model.addAttribute("pwd", pwd);
		
		return "joinus/searchPwd";
	}
	
	@RequestMapping(value="idCheck", method=RequestMethod.POST)
	public void idCheck(String uid, PrintWriter out){
		String chkId="";
		chkId = memberDao.idCheck(uid);
		out.write((chkId!=null)? "no":"ok");
	}
	
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
