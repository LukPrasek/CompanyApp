package pl.lukaszprasek.CompanyApp.rest.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.lukaszprasek.CompanyApp.application.SiteManager;
import pl.lukaszprasek.CompanyApp.common.mappers.RequestSiteToDtoMapper;
import pl.lukaszprasek.CompanyApp.rest.dto.SiteDto;
import pl.lukaszprasek.CompanyApp.rest.request.SiteRequestCreation;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("rest/v1/")
@Api("Show all api")
public class SiteController {

    private final SiteManager siteManager;
    private final RequestSiteToDtoMapper requestSiteToDtoMapper;

    @Autowired
    public SiteController(SiteManager siteManager, RequestSiteToDtoMapper requestSiteToDtoMapper) {
        this.siteManager = siteManager;
        this.requestSiteToDtoMapper = requestSiteToDtoMapper;
    }

    @GetMapping(value = "site/{id}", produces = "application/json")
    @ApiOperation("Get site by Id")
    public SiteDto getSiteById(@PathVariable("id") long id) {
        return siteManager.getSiteById(id);
    }

    @GetMapping(value = "allsites", produces = "application/json")
    @ApiOperation("Get all sites")
    public List<SiteDto> getAllSites() {
        return siteManager.getAllSites();
    }

    @PostMapping(value = "site/add", produces = "application/json")
    @ApiOperation("Add new site")
    public SiteDto addNewSite(@Valid @RequestBody SiteRequestCreation siteRequestCreation) {
        SiteDto responseSiteDto = siteManager.addNewSite(requestSiteToDtoMapper.mapToDto(siteRequestCreation));
        return responseSiteDto;
    }
}
