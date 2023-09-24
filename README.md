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


可以@Import其他bean

无法自动装配。找不到 'UserMapper' 类型的 Bean。
解决：在mapper上加上注解@Mapper与@Repository

public interface UserMapper {
@Select("select * from login")
List<User> findAll();
}
也可以这样，就不需要mapper.xml文件了



AOP
面向切面编程:动态代理技术，增强方法的

@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
事务控制
@EnableTransactionManagement
@Bean
public DataSourceTransactionManager dataSourceTransactionManager(DataSource dataSource){
DataSourceTransactionManager dataSourceTransactionManager=new DataSourceTransactionManager();
dataSourceTransactionManager.setDataSource(dataSource);
return dataSourceTransactionManager;
}