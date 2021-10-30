package com.colin.mysql;

import com.colin.data.DataSaveService;

/**
 * @author colin
 * @create 2021-10-30 12:54
 */
public class MySQLSaveService implements DataSaveService {

    @Override
    public void saveDate(String data) {
        System.out.println("Mysql 保存了数据→"+data);
    }
}
