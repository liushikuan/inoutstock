package dao;

import org.apache.ibatis.annotations.Param;

public interface TestDao {
	//���Ը��²���
	public void testUpdate (@Param("name")String name, @Param("id")String id);
}
