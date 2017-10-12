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
		System.out.println("�yԇ����");
		testDao.testUpdate("��������", "1");
	}
	
//	@Test
	public void goodDaoInsert () throws Exception{
		System.out.println("������Ʒ��Ϣ");
		goodDao.insertGood(new Good(UUID.randomUUID().toString()
				                  , "С��Ь"
				                  , "F"
				                  , null
				                  , null
				                  , null));
	}
	
	
	
	@Test
	public void queryGoods () throws Exception{
		System.out.println("��ѯ��Ʒ��Ϣ");
		List<Good> list = goodService.queryGoods();
		System.out.println("��Ʒ��Ϣ====" +  JSON.toJSONString(list));
	}
	
//	@Test
	public void deleteGoodByid () throws Exception{
		System.out.println("ɾ����Ʒ��Ϣ");
		goodDao.deleteGoodByid("989f367b-c4fb-4616-a898-cb644b6d266b");
	}
}