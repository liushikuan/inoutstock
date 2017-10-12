package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import entity.Good;
import service.GoodService;

/** 
* @author liushikuan
* @date   2017年10月7日 下午10:35:43 
* 商品控制层
*/
@Controller
@RequestMapping(value = "/good")
public class GoodController {

	@Autowired
	private GoodService goodService;
	
	@RequestMapping(value = "" , method = RequestMethod.POST)
	public String insertGood(@RequestBody Good good) {
		try {
			goodService.insertGood(good);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}
	
	@RequestMapping(value = "/list" , method = RequestMethod.GET)
	public String goodList(Model model) {
		List<Good> list = goodService.queryGoods();
		model.addAttribute("goodlist", list);
		return "list";
	}
}
 