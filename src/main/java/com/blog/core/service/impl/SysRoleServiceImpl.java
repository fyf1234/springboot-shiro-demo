package com.blog.core.service.impl;

import com.blog.core.dao.SysRoleDao;
import com.blog.core.entity.SysRoleEntity;
import com.blog.core.service.SysRoleService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

/**
 * @Description 角色业务实现
 * @Author youcong
 */
@Service("sysRoleService")
public class SysRoleServiceImpl extends ServiceImpl<SysRoleDao, SysRoleEntity> implements SysRoleService {

    /**
     * 通过用户ID查询角色集合
     * @Author youcong
     * @Param  userId 用户ID
     * @Return List<SysRoleEntity> 角色名集合
     */
    @Override
    public List<SysRoleEntity> selectSysRoleByUserId(Long userId) {
        return this.baseMapper.selectSysRoleByUserId(userId);
    }
}