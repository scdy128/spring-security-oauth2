package com.lilei.oauth2.server.service.impl;

import com.lilei.oauth2.server.mapper.TbRoleMapper;
import com.lilei.oauth2.server.service.TbRoleService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
@Service
public class TbRoleServiceImpl implements TbRoleService {

    @Resource
    private TbRoleMapper tbRoleMapper;

}
