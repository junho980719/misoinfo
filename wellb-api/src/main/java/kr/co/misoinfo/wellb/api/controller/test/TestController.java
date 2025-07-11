package kr.co.misoinfo.wellb.api.controller.test;

import kr.co.misoinfo.core.response.ApiResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public ApiResult<Map<String, Object>> test() {
        return ApiResult.ok(Map.of("key1", "value1", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5"));
    }
}