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
        List<String[]> strings = POIExcelUtil.readExcel("C:\\Users\\21125\\Desktop\\test.xlsx",3);
        strings.stream().forEach( array ->{
            Arrays.stream(array).forEach(
                    item-> System.out.print(item+' '));
            System.out.println();
                });
        System.out.println("\n\n\n");

    }


}
