package com.zhong.wiki.controller;

import com.zhong.wiki.domain.Ebook;
import com.zhong.wiki.resp.CommonResp;
import com.zhong.wiki.resp.EbookResp;
import com.zhong.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;


    @GetMapping("/list")
    public CommonResp list(Ebook req){
        CommonResp<List<EbookResp>> resp= new CommonResp<>();
        List<EbookResp> list = ebookService.list(req);
        resp.setContent(list);
        return resp;
    }
}

