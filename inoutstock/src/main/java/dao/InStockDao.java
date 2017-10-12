package dao;

import org.apache.ibatis.annotations.Param;

import entity.InStockHistory;

/*
 * @author liushikuan
 * @date   2017年10月3日11:56:45
 * 
 * 入库功能接口
 */
public interface InStockDao {
	
	//增加进货历史
	public void insertInStockHistory (@Param("instockhistory")InStockHistory instockhistory);
	
}
