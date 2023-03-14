package com.lht.ly.controller;

import com.lht.ly.model.entity.Links;
import com.lht.ly.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("api/links")
public class LinkController {

    final
    LinkService linkService;

    public LinkController(LinkService linkService) {
        this.linkService = linkService;
    }

    @GetMapping("/allLinks")
    ArrayList<Links> getAllLinks() {
        return linkService.allLinks();
    }
}
