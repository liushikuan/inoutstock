package service;

import java.util.List;

import entity.Good;

/**
 * @author liushikuan
 * @date   2017年10月7日 下午8:17:58
 * 商品服务类
 */
public interface GoodService {
	//添加
	public void insertGood(Good good);
	
	//查看
	public List<Good> queryGoods();
	
	//删除
	public void deleteGoodByid(String goodnum);
}
 