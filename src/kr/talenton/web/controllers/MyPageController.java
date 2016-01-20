package kr.talenton.web.controllers;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.talenton.web.dao.MemberDao;
import kr.talenton.web.vo.Member;

@Controller
@RequestMapping("/myPage/myInformation/")
public class MyPageController {
	
	private MemberDao memberDao;
	
	@RequestMapping("modifyInformation")
	public String modifyInformation(Model model) throws SQLException{
		List<Member> list = memberDao.getMembers();
		
		model.addAttribute("member",list);
		
		return "myPage/myInformation/modifyInformation";
	}
	
}
