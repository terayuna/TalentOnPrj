package kr.talenton.web.controllers;

import java.security.Principal;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.talenton.web.dao.MemberDao;
import kr.talenton.web.vo.Member;

@Controller
@RequestMapping("/myPage/myInformation/")
public class MyPageController {
	
	@Autowired
	private MemberDao memberDao;
	
	@RequestMapping("modifyInformation")
	public void modifyInformation(Model model,Principal principal) throws SQLException{
		
		Member member = memberDao.getMember(principal.getName());
		model.addAttribute("member",member);
		
	}
	
}