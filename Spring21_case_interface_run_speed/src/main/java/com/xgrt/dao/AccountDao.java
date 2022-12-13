package com.xgrt.dao;

import com.xgrt.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository//可以不写，运行的了，但是会报error
public interface AccountDao {

    @Insert("insert into tb1_account(name,money)values(#{name},#{money})")
    void save(Account account);

    @Delete("delete from tb1_account where id = #{id} ")
    void delete(Integer id);

    @Update("update tb1_account set name = #{name} , money = #{money} where id = #{id} ")
    void update(Account account);

    @Select("select * from tb1_account")
    List<Account> findAll();

    @Select("select * from tb1_account where id = #{id} ")
    Account findById(Integer id);
}