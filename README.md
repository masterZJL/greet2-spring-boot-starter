# greet2-spring-boot-starter
自定义springboot starter
# 新建一个springboot项目 
项目名 greet2-spring-boot-starter
源码包路径 com.study.zjl.greet2
创建阶段不引入任何依赖
修改pom.xml文件
删除build构建标签
引入 spring-boot-autoconfigure 依赖、spring-boot-configuration-processor 依赖
# 删除test包、test依赖、main启动类，源代码路径下添加service包、properties包
# properties包下新建 GreetProperties类
使用 @ConfigurationProperties 注解
注解中配置：配置属性前缀，如 zjl.greet
类属性定义配置属性：如name、age、url、state等
# service包下新建GreetService类
导入属性 greetProperties
定义实用方法 greetSomeOne(),使用greetProperties中的配置信息，完成greetService服务的初始化
# properties包下新建 GreetAutoConfigration类
使用 @Configuration 注解
使用 @EnableConfigurationProperties(GreetProperties.class) 注解
完成该starter中服务提供者的构建，比如redisTemplate、dataSource、greetService；
使用 @Bean 注解将一个方法返回的 greetService 对象注册到Spring 容器中
# resources文件夹下新建 META-INF文件夹，META-INF文件夹下创建 spring.factories 服务注册文件
org.springframework.boot.autoconfigure.EnableAutoConfiguration=\
  com.study.zjl.greet2.properties.GreetAutoConfigration
# 执行 mvn clean install 生成依赖，注册到本地仓库
# 使用时 直接导入 starter 依赖坐标，External Libraries包下边会出现我们自定义的依赖 jar 包
spring.factories 会被springboot自动扫描到，加载到我们的自动配置类 GreetAutoConfigration，完成我们服务的注册


    
