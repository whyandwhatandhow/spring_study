package aop.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

@Component
public interface AccountMapper {

    @Update("update tb_account set money=money-#{money} where account_name=#{account_Name}")
    void decriceMoney(@Param("account_Name")String account_Name,@Param("money")Integer money);

    @Update("update tb_account set money=money+#{money} where account_name=#{account_Name}")
    void increaseMoney(@Param("account_Name")String account_Name,@Param("money")Integer money);
}
