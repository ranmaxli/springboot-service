# springboot-service
 微服务分布式框架

1、部署zookeeper、dubbo环境
https://www.cnblogs.com/ukzq/p/12030641.html

2、配置maven相关依赖

3、配置项目中的数据库、dubbo环境
application.properties

#datasource start
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/test
spring.datasource.username=root
spring.datasource.password=root
#datasource end

#dubbo start
dubbo.config.location=classpath:dubbo-consumer.xml
dubbo.application.name=ranmaxli-service-core
dubbo.registry.address=localhost:2181
dubbo.protocol.port=20990
#dubbo end

4、服务启动后，根据zk的注册信息修改 dubbo-consumer.xml 中的ip地址
 <dubbo:reference id="userService" interface="com.ranmaxli.api.service.UserServices" timeout="50000" url="dubbo://192.168.14.1:20991"/>
