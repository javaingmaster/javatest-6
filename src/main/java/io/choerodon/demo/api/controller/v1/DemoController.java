package io.choerodon.demo.api.controller.v1;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.choerodon.core.iam.ResourceLevel;
import io.choerodon.swagger.annotation.Permission;

@RestController
public class DemoController {
    @Value("${me.number}")
    private String number;
    @Value("${me.name}")
    private String name;

        @GetMapping("/hello")
        @ApiOperation(value = "20611test")
        public ResponseEntity<String> hello() {
        return new ResponseEntity<String>("hello "+name+" "+number, HttpStatus.OK);
     }
}
