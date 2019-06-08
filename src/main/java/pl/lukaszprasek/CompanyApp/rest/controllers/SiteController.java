package pl.lukaszprasek.CompanyApp.rest.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.lukaszprasek.CompanyApp.application.SiteMenager;
import pl.lukaszprasek.CompanyApp.domain.entities.SiteEntity;
import pl.lukaszprasek.CompanyApp.domain.services.SiteService;
import pl.lukaszprasek.CompanyApp.rest.dto.SiteDto;

@RestController
@RequestMapping("rest/v1/")
@Api("Show all api")
public class SiteController {

    private final SiteMenager siteMenager;
    @Autowired
    public SiteController(SiteMenager siteMenager) {
        this.siteMenager = siteMenager;
    }

    @GetMapping(value = "site/{id}", produces = "application/json")
    @ApiOperation("Get site by Id")
    public SiteDto getSiteById(@PathVariable("id") long id) {
        return siteMenager.getSiteById(id);
    }
}
