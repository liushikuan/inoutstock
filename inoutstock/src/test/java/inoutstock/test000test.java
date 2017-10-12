package inoutstock;

import java.util.List;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import dao.GoodDao;
import dao.TestDao;
import entity.Good;
import service.GoodService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml",
					   "classpath:spring/spring-service.xml"})
public class test000test {
	
	@Autowired
	private TestDao testDao;
	
	@Autowired
	private GoodDao goodDao;
	
	@Autowired
	private GoodService goodService;

//	@Test
	public void testUpdate () throws Exception{
		System.out.println("測試更新");
		testDao.testUpdate("哈哈哈哈", "1");
	}
	
//	@Test
	public void goodDaoInsert () throws Exception{
		System.out.println("插入商品信息");
		goodDao.insertGood(new Good(UUID.randomUUID().toString()
				                  , "小白鞋"
				                  , "F"
				                  , null
				                  , null
				                  , null));
	}
	
	
	
	@Test
	public void queryGoods () throws Exception{
		System.out.println("查询商品信息");
		List<Good> list = goodService.queryGoods();
		System.out.println("商品信息====" +  JSON.toJSONString(list));
	}
	
//	@Test
	public void deleteGoodByid () throws Exception{
		System.out.println("删除商品信息");
		goodDao.deleteGoodByid("989f367b-c4fb-4616-a898-cb644b6d266b");
	}
}