package com.sky.mapper;

import com.sky.entity.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper {

    /**
     * 根据用户名查询员工
     * @param username
     * @return
     */
    @Select("select * from employee where username = #{username}")
    Employee getByUsername(String username);

    /**
     * 插入员工数据
     * @param employee
     */
    @Insert("insert into employee (name,username,password,phone,sex,id_number,update_time,create_time,update_user,create_user,status)" +
            "values " +
            "(#{name},#{username},#{password},#{phone},#{sex},#{idNumber},#{updateTime},#{createTime},#{updateUser},#{createUser},#{status})")
    void insert(Employee employee);
}
