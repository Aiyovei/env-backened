package com.env.envbackend;


import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class EnvBackendApplicationTests {

    @Test
    void contextLoads() throws IOException {
        List<String[]> strings = POIExcelUtil.readExcel("test.xlsx",2);
        strings.stream().forEach( array ->{
            Arrays.stream(array).forEach(
                    item-> System.out.print(item+' '));
            System.out.println();
                });

    }

}
