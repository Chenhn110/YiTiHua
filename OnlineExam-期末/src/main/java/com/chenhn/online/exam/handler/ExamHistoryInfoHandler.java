package com.chenhn.online.exam.handler;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chenhn.online.exam.po.ExamHistoryInfo;
import com.chenhn.online.exam.service.ExamHistoryPaperService;

/**
  *
  * <p>Title: ExamHistoryInfoHandler</p>
  * <p>Description: </p>
  * @author: chen
  * @date: 2019-5-5
  * @time: 下午4:51:48
  * @version: 1.0
  */

@Controller
public class ExamHistoryInfoHandler {

	@Autowired
	private ExamHistoryPaperService examHistoryPaperService;
	
	private Logger logger = Logger.getLogger(ExamHistoryInfoHandler.class);
	
	
	@RequestMapping("/historys")
	public ModelAndView examHistorys() {
		List<ExamHistoryInfo> historys = examHistoryPaperService.getExamHistoryToTeacher();
		ModelAndView model = new ModelAndView("admin/examHistorys");
		logger.info("教师 查询历史考试信息 SIZE "+historys.size());
		
		model.addObject("historys", historys);
		
		return model;
	}
}
