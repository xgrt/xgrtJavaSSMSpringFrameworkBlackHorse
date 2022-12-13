import com.xgrt.config.SpringConfig;
import com.xgrt.domain.Account;
import com.xgrt.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = ctx.getBean(AccountService.class);
        Account account = accountService.findById(1);
        System.out.println(account);
    }
}
