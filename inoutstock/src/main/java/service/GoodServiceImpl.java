package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dao.GoodDao;
import entity.Good;

/** 
* @author liushikuan
* @date   2017��10��7�� ����8:17:58 
* ��˵�� 
*/
@Service
public class GoodServiceImpl implements GoodService{
	
	@Autowired
	GoodDao goodDao;
	
	public void insertGood(Good good) {
		goodDao.insertGood(good);		
	}

	public List<Good> queryGoods() {
		return goodDao.queryGoods();
	}

	public void deleteGoodByid(String goodnum) {
		goodDao.deleteGoodByid(goodnum);
	}

}
 