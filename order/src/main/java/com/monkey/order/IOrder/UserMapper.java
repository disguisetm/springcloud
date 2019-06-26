package com.monkey.order.IOrder;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.monkey.order.Bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {
}
