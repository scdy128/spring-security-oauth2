package com.lilei.oauth2.resource.services.impl;

import com.lilei.oauth2.resource.mapper.TbContentCategoryMapper;
import com.lilei.oauth2.resource.services.TbContentCategoryService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
@Service
public class TbContentCategoryServiceImpl implements TbContentCategoryService {

    @Resource
    private TbContentCategoryMapper tbContentCategoryMapper;

}
