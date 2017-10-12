package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Good;

/*
 * @author liushikuan
 * @date   2017年10月3日11:56:45
 * 
 * 货物接口
 */
public interface GoodDao {
	//增加货物类型
	public void insertGood (@Param("good")Good good);
	
	//查看所有货物
	public List<Good> queryGoods ();
	
	//删除货物
	public void deleteGoodByid (@Param("goodnum")String goodnum);
}
