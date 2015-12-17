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
import kr.talenton.web.vo.Notice;

@Controller
@RequestMapping("/customer/")
public class CustomerController {
	
	@Autowired
	private NoticeDao noticeDao;


	@RequestMapping("notice")
	public String notice(PrintWriter out, Model model) throws SQLException{  
		/*NoticeDao dao = new MyBatisNoticeDao();  이런식으로 만들수도 있지만 위의 방법처럼 분리시켜둠*/
		List<Notice> list = noticeDao.getNotices(1, "TITLE", "");
		
		
		model.addAttribute("list", list);  
		//model.addAttribute("n", list);
		/*for(Notice n : list)
			out.println("title : "+n.getTitle() + "<br/>");*/
	
		return "customer/notice";                             
	}
	
	
	@RequestMapping("noticeDetail")
	public String noticeDetail(String c, Model model) throws SQLException
	{
		Notice notice = noticeDao.getNotice(c);
		Notice prev = noticeDao.getPrevNotice(c);
		Notice next = noticeDao.getNextNotice(c);
		
		model.addAttribute("notice", notice);
		model.addAttribute("prev", prev);
		model.addAttribute("next", next);
		
		return "customer/noticeDetail";
	}
	
	@RequestMapping(value="noticeReg", method=RequestMethod.GET)
	public String noticeReg(HttpSession session)
	{
		/*if(session.getAttribute("mid")==null)
			return "redirect: ../joinus/login?returnUrl=/customer/noticeReg";
		*/
		
		return "customer/noticeReg"; //view를 제공해야함
	}
	
	@RequestMapping(value="noticeReg", method=RequestMethod.POST)
	public String noticeReg(Notice n) throws SQLException
	{
		/*if(session.getAttribute("mid")==null)
			return "redirect: ../joinus/login?returnUrl=/customer/noticeReg";*/
		noticeDao.insert(n);
		
		/*System.out.println("title : "+ title);
		System.out.println("content : "+ content);*/
		
		return "redirect:notice"; //다른 Controller로 가야한다. (noticeReg에서 notice로 이동 (글쓰기를 끝내면 다시 목록창으로))
	}
	@RequestMapping("noticeEdit")
	public String noticeEdit(String code, HttpSession session)
	{
		/*if(session.getAttribute("mid")==null)
			return "redirect: ../joinus/login?returnUrl=/customer/noticeEdit";*/
		return "costomer/noticeEdit";
	}
	
	@RequestMapping("noticeDel")
	public String noticeDel(String c) throws SQLException
	{
		noticeDao.delete(c);
		return "redirect:notice";
	}

}
