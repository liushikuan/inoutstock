package dao;

import org.apache.ibatis.annotations.Param;

import entity.Vendor;

/*
 * @author liushikuan
 * @date   2017年10月3日11:56:45
 * 
 * 供应商接口
 */
public interface VendorDao {
	
	//增加供应商
	public void insertVendor (@Param("vendor")Vendor vendor);
}
