# JDK 的服务发现机制 SPI

#### SPI

<img src="img/三层架构中'面向抽象编程'架构示意图.png"/>

SPI：Service Provider Interface，服务提供者接口，是一种服务发现机制。



#### JDK 的 SPI 规范

JDK 的 SPI 规范规定：

- 接口名：可随意定义 
- 实现类名：可随意定义 
- 提供者配置文件路径：其查找的目录为 META-INF/services 
- 提供者配置文件名称：接口的全限定性类名，没有扩展名。 
- 提供者配置文件内容：该接口的所有实现类的全限类性类名写入到该文件中，一个类名 占一行



#### SPI 实现机制

1. ServiceLoader：load()方法内指定一个接口，他就会加载当前系统下所有实现了这个接口的「指定实现类」
2. SPI（Service Provider Interface）
    - 接口工程---提供接口
        - 实现工程（一）：实现了接口。「在 META-INF/services 目录下创建文件，接口名作为文件名，实现类全路径作为文件内容」
        -  实现工程（二）：实现了接口。「在 META-INF/services 目录下创建文件，接口名作为文件名，实现类全路径作为文件内容」
    -  客户端---引用工程（一）或者工程（二），利用 ServiceLoader 加载并调用