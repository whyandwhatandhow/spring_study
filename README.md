# spring_study
系统学习spring的项目

用注解的类都要在配置文件用上这个扫描
      <context:component-scan base-package="com"/>

@Component:@Repository(Dao) @Service(service)  @Controller(web)


注入
@Value注入数据
@Autowired根据类型注入引用数据  service里面注入dao
@Qualifier 结合@Autowired根据名称注入
@Resource根据类型名称注入


用config来代替xml文件
@Configuration
@ComponentScan("com")//可以加大括号写多个
@PropertySource("classpath:jdbc.properties")

ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
