package dao;

import org.apache.ibatis.annotations.Param;

import entity.Vendor;

/*
 * @author liushikuan
 * @date   2017��10��3��11:56:45
 * 
 * ��Ӧ�̽ӿ�
 */
public interface VendorDao {
	
	//���ӹ�Ӧ��
	public void insertVendor (@Param("vendor")Vendor vendor);
}
