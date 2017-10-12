package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Good;

/*
 * @author liushikuan
 * @date   2017��10��3��11:56:45
 * 
 * ����ӿ�
 */
public interface GoodDao {
	//���ӻ�������
	public void insertGood (@Param("good")Good good);
	
	//�鿴���л���
	public List<Good> queryGoods ();
	
	//ɾ������
	public void deleteGoodByid (@Param("goodnum")String goodnum);
}
