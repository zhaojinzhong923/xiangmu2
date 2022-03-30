package com.zhong.wiki.service;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.zhong.wiki.domain.Ebook;
import com.zhong.wiki.domain.EbookExample;
import com.zhong.wiki.mapper.EbookMapper;
import com.zhong.wiki.resp.EbookResp;
import com.zhong.wiki.util.CopyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(Ebook req){
        EbookExample ebookExample= new EbookExample();
        EbookExample.Criteria criteria=ebookExample.createCriteria();
        criteria.andNameLike("%"+req.getName()+"%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

//        List<EbookResp> respList= new ArrayList<>();
//        for (Ebook ebook : ebookList) {
////            EbookResp ebookResp =new EbookResp();
////            BeanUtils.copyProperties(ebook,ebookResp);
//
//            EbookResp ebookResp=CopyUtil.copy(ebook,EbookResp.class);
//
//            respList.add(ebookResp);
//        }

        List<EbookResp> list=CopyUtil.copyList(ebookList,EbookResp.class);

        return list;
    }
}
