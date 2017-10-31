package com.example.demo_jpa.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo_jpa.Dao.MemberRepository;
import com.example.demo_jpa.Entity.Member;

@Controller
@RequestMapping("/member/")
public class MemberController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private MemberRepository memberRepository;
	
	@RequestMapping("{memberId}/search.do")
	public String viewMember(@PathVariable String memberId, Model model) throws Exception {
		
		memberRepository.save(new Member("your name", 24));
		
		logger.info(String.format("Parameber member id : [%s]", memberId));
		Member member = memberRepository.findOne(memberId);
		
		if(member != null) {
			logger.info(member.toString());
			model.addAttribute("member", member);
		} else {
			throw new Exception("No Data");
		}
		return "member/viewMember";
	}
}
