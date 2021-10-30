package com.colin.redis;

import com.colin.data.DataSaveService;

/**
 * @author colin
 * @create 2021-10-30 12:51
 */
public class RedisSaveService implements DataSaveService {

    @Override
    public void saveDate(String data) {
        System.out.println("Redis 保存了数据→"+data);
    }
}
