package dao;

import org.apache.ibatis.annotations.Param;

import entity.InStockHistory;

/*
 * @author liushikuan
 * @date   2017��10��3��11:56:45
 * 
 * ��⹦�ܽӿ�
 */
public interface InStockDao {
	
	//���ӽ�����ʷ
	public void insertInStockHistory (@Param("instockhistory")InStockHistory instockhistory);
	
}
