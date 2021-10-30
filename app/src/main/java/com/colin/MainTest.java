package com.colin;

import com.colin.data.DataSaveService;

import java.util.ServiceLoader;

/**
 * @author colin
 * @create 2021-10-30 12:49
 *
 * 1.ServiceLoader：load()方法内指定一个接口，他就会加载当前系统下所有实现了这个接口的「指定实现类」
 * 2.SPI（Service Provider Interface）
 *      接口工程---提供接口
 *          实现工程（一）：实现了接口。「META-INF/services 目录下创建文件，接口名作为文件名，实现类全路径作为文件内容」
 *          实现工程（二）：实现了接口。「META-INF/services 目录下创建文件，接口名作为文件名，实现类全路径作为文件内容」
 *
 *      客户端---引用工程（一）或者工程（二）
 */
public class MainTest {

    public static void main(String[] args) {

        // 加载可用的接口实现
        ServiceLoader<DataSaveService> load = ServiceLoader.load(DataSaveService.class);

        // 拿到所有实现，并进行调用
        for (DataSaveService dataSaveService : load) {
            dataSaveService.saveDate("hello，SPI");
        }
    }
}
