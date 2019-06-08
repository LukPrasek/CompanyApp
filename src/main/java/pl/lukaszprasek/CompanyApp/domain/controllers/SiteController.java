package pl.lukaszprasek.CompanyApp.domain.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.lukaszprasek.CompanyApp.domain.entities.SiteEntity;
import pl.lukaszprasek.CompanyApp.domain.services.SiteService;

@RestController
@RequestMapping("rest/v1/")
@Api("Show all api")
public class SiteController {

    private final SiteService siteService;

    @Autowired
    public SiteController(SiteService siteService) {
        this.siteService = siteService;
    }


    @GetMapping(value = "site/{id}", produces = "application/json")
    @ApiOperation("Get site by Id")
    public SiteEntity index(@PathVariable("id") long id) {

        return siteService.getSiteById(id);
    }
}
