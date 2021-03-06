package com.mycompany.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mycompany.domain.BoardVO;
import com.mycompany.domain.Criteria;
import com.mycompany.domain.PageMaker;
import com.mycompany.domain.SearchCriteria;
import com.mycompany.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
 
 @Inject
 BoardService service;
 
 // 글 작성 get
 @RequestMapping(value = "/write", method = RequestMethod.GET)
 public void getWrite() throws Exception {
  logger.info("get write");
 }

 // 글 작성 post
 @RequestMapping(value = "/write", method = RequestMethod.POST)
 public String postWrite(BoardVO vo) throws Exception {
  logger.info("post write");
  
  service.write(vo);
  
  return "redirect:/";
 }
 
 //글 목록
 @RequestMapping(value="/list",method=RequestMethod.GET)
 public void list(Model model) throws Exception{
	 logger.info("get list");
	 
	 List<BoardVO> list = service.list();
	 model.addAttribute("list",list);
 }
 
 //글 조회
 @RequestMapping(value="/read",method=RequestMethod.GET)
 public void getRead(@RequestParam("bno") int bno,Model model) throws Exception{
	 logger.info("get read");
	 
	 BoardVO vo = service.read(bno);
	 model.addAttribute("read",vo);
 }
 
 //글 수정
 @RequestMapping(value="/modify",method=RequestMethod.GET)
 public void getModify(@RequestParam("bno") int bno, Model model) throws Exception{
	 logger.info("get modify");
	 
	 BoardVO vo = service.read(bno);
	 
	 model.addAttribute("modify",vo);
 }
 
 
 //글 삭제
 @RequestMapping(value = "/delete", method = RequestMethod.GET)
 public void getDelete(@RequestParam("bno") int bno, Model model) throws Exception {
  logger.info("get delete");
    
  model.addAttribute("delete", bno);
  
 }
 
 // 글 수정  POST 
 @RequestMapping(value = "/modify", method = RequestMethod.POST)
 public String postModify(BoardVO vo) throws Exception {
  logger.info("post modify");
  
  service.update(vo);
  
  return "redirect:/board/list";
  
 }

 // 글 삭제  POST
 @RequestMapping(value = "/delete", method = RequestMethod.POST)
 public String postDelete(@RequestParam("bno") int bno) throws Exception {
  logger.info("post delete");
    
  service.delete(bno);
  
  return "redirect:/board/list";
 }
 
 //목록 +페이징
 @RequestMapping(value="/listPage",method=RequestMethod.GET)
 public void listPage(Criteria cri,Model model) throws Exception{
	 logger.info("get list Page");
	 
	 List<BoardVO> list = service.listPage(cri);
	 
	 model.addAttribute("list",list);
	 
	 PageMaker pageMaker = new PageMaker();
	 pageMaker.setCri(cri);
	 pageMaker.setTotalCount(service.listCount());
	 model.addAttribute("pageMaker",pageMaker);
 }
 
 //목록+페이징+검색
 @RequestMapping(value="/listSearch",method=RequestMethod.GET)
 public void listSearch(@ModelAttribute("scri") SearchCriteria scri,Model model) throws Exception{
	 
	 logger.info("get list Search");
	 
	 List<BoardVO> list = service.listSearch(scri);
	 model.addAttribute("list",list);
	 
	 PageMaker pageMaker = new PageMaker();
	 pageMaker.setCri(scri);
	 pageMaker.setTotalCount(service.countSearch(scri));
	 model.addAttribute("pageMaker",pageMaker);
	 
 }
 
 
 
  
}
