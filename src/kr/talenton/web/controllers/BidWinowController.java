package kr.talenton.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/bidWindow/")
public class BidWinowController {

	@RequestMapping(value="bidWindow", method=RequestMethod.GET)
	public String bidWindow()
	{
		return "bidWindow/bidWindow";
	}
	
}
