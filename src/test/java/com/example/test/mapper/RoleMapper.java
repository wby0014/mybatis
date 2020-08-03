package com.example.test.mapper;

import com.example.test.po.Role;

/**
 * @Description
 * @Date 2020/8/3 19:12
 * @Author wuby31052
 */
public interface RoleMapper {

    public Role getRole(Long id);

    public Role findRole(String roleName);

    public int deleteRole(Long id);

    public int insertRole(Role role);

}
