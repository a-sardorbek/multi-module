package com.system;

import com.system.core.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void createTest(){
        Assertions.assertThrows(NullPointerException.class,()-> Utils.isAllPositiveNumbers(new String[] {null}));
        Assertions.assertThrows(NumberFormatException.class,()-> Utils.isAllPositiveNumbers(new String[] {"15a0","55","555"}));
        Assertions.assertEquals(false,Utils.isAllPositiveNumbers(new String[] {"150","0","-540"}));
        Assertions.assertEquals(true,Utils.isAllPositiveNumbers(new String[] {"155","55","555"}));
    }

}
