package kr.co.korea.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;

import kr.co.korea.beans.TestBean;

public interface TestMapper {

	@Insert("insert into promember values(#{code}, #{name}, #{id}, #{pwd}, #{age})")
	void insertMemberInfo(TestBean testBean);
	
	@Delete("delete from promember where id = #{id}")
	void deleteMemberInfo(TestBean testBean);
}