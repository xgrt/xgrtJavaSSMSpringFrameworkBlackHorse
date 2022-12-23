package com.xgrt.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDao {
    @Update("update tb1_account set money=money+#{money} where name=#{name}")
    void inMoney(@Param("name") String name, @Param("money") Double money);

    @Update("UPDATE tb1_account set money=money-#{money} where name=#{name}")
    void outMoney(@Param("name") String name, @Param("money") Double money);
}
