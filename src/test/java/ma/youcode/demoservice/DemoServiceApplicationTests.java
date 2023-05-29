package ma.youcode.demoservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class DemoServiceApplicationTests {


    @Value("${spring.datasource.url}")
    String dataSourceUrl ;

    @Test
    void contextLoads() {
        assertNotNull(dataSourceUrl);
        assertEquals(dataSourceUrl,"jdbc:h2:mem:stock_management_test_db");
    }

}
