package com.money.store.openplatform;

import com.money.store.model.UmsUser;
import com.money.store.openplatform.domain.UmsPersonDeveloper;
import com.money.store.openplatform.util.ip.AddressUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//@SpringBootTest
class StoreOpenplatformApplicationTests {

    @Test
    void contextLoads() {
        // 按指定模式在字符串查找
        String realAddressByIP = AddressUtils.getRealAddressByIP("125.78.92.177");
        System.out.println(realAddressByIP);
    }

}
