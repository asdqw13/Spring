package kr.co.korea.database;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import kr.co.korea.beans.DataBean;

public interface MapperSql {
	
	@Insert("insert into memtable(id, name, pw) values(#{id}, #{name}, #{pw})")
	void insert_data(DataBean dataBean);
	
	@Select("select * from memtable")
	List<DataBean> select_data();
	
	@Select("select count(*) from memtable")
	int select_one();
}