package com.jlzs.killer.mapper.user;

import com.jlzs.killer.domain.user.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoMapper {
    UserInfo getUserInfo(String userPhone);
}
