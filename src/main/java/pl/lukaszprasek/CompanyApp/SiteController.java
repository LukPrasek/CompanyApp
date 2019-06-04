package pl.lukaszprasek.CompanyApp;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/v1/")
@Api("Show all api")
public class SiteController {

    @GetMapping(value = "index/")
    @ApiOperation("Get all cars")
    @ResponseBody
    public String index() {
         return "Na razie proba";
    }
}
