package service;

import com.xgrt.config.SpringConfig;
import com.xgrt.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)//默认配置的是字符串类型
public class AccountServiceTest {

    //定义业务层接口
    @Autowired
    private AccountService accountService;

    @Test
    public void testFindById(){
        System.out.println(accountService.findById(2));
    }

    @Test
    public void testFindAll()
    {
        System.out.println(accountService.findAll());
    }
}
