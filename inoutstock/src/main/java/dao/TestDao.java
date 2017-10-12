package dao;

import org.apache.ibatis.annotations.Param;

public interface TestDao {
	//²âÊÔ¸üĞÂ²Ù×÷
	public void testUpdate (@Param("name")String name, @Param("id")String id);
}
