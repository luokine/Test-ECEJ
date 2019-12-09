package com.tzqTest.test.core;

import com.tzqTest.bean.Cup;
import com.tzqTest.bean.Phone;
import org.junit.Test;


/**
 * @author: tianziquan
 * @create: 2019-12-05 18:18
 */
public class EntityTest {

    @Test
    public void testCopyBean(){

        Cup cup = new Cup();
        cup.setHeigh(1);
        cup.setName("cafe");
        Phone phone = new Phone();
    }
}
