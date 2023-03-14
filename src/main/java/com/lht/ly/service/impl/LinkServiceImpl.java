package com.lht.ly.service.impl;

import com.lht.ly.model.entity.Links;
import com.lht.ly.service.LinkService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LinkServiceImpl implements LinkService {
    @Override
    public ArrayList<Links> allLinks() {
        return new ArrayList<>();
    }
}
