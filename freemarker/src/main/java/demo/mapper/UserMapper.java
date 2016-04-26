package demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import demo.domain.User;

public interface UserMapper {
	
	@Select("select * from user")
	public List<User> getAllUsers();
}
