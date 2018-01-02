package privateBlog.gonnichiwa.sample.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import privateBlog.gonnichiwa.sample.service.SampleService;

@CrossOrigin
@Controller
public class SampleController {
	
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="sampleService")
	private SampleService sService;
	
//	@CrossOrigin 컨트롤러의 메소드에 달면 해당 요청만 CrossOrigin 처리
	@RequestMapping(value="/sample/getMenuList.do")
	public ModelAndView getMenuList(Map<String, Object> commandMap) throws Exception{
		ModelAndView mav = new ModelAndView();
		log.debug("getMenuList!");
		
		List<Map<String,Object>> menuList = sService.selectMenuList(commandMap);
		mav.addObject("menuList",menuList);
		
		mav.setViewName("jsonView");
		return mav;
		
	}
}
