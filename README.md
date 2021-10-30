# my-spi

#### SPI 机制
1. ServiceLoader：load()方法内指定一个接口，他就会加载当前系统下所有实现了这个接口的「指定实现类」
2. SPI（Service Provider Interface）
    - 接口工程---提供接口
        - 实现工程（一）：实现了接口。「在 META-INF/services 目录下创建文件，接口名作为文件名，实现类全路径作为文件内容」
        -  实现工程（二）：实现了接口。「在 META-INF/services 目录下创建文件，接口名作为文件名，实现类全路径作为文件内容」
    -  客户端---引用工程（一）或者工程（二），利用 ServiceLoader 加载并调用