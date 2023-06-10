package ma.youcode.demoservice.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/demo/config")
public class DemoController {


    @Value("${server.port}")
    String port ;

    @Value("${spring.datasource.url}")
    String dataSourceURL ;


    @GetMapping
    public String getApplicationProperties(){
        return String.format("server port is %s and data source URL : %s",port , dataSourceURL);
    }
}
