# ssmDemo02 项目创建流程
1.创建java web project  

2.导入jar包  
    spring-framework -10个  
	  aopalliance -1  
	aspectjweaver -1  
	jackon -3  
	jakarta-taglibs-standard -2  
	mybatis -1+10  
	mybatis-spring -1  
	mysql-connector-java -1  
  
3.编写配置文件  
	web.xml  
		spring配置  
		springmvc配置  
	applicationContext.xml  
		配置dataSource  
		配置声明式事务管理器  
		配置事物传播属性  
		配置参与事务的类  
		配置扫描注解  
	db.properties  
		配置数据库连接信息  
	spring-mvc.xml  
		配置扫描控制层的注解  
	mybatis.xml  

4.调试成功	
	
5.WebContent目录拷入WeAdmin目录，作为后台管理页面  
	登录页添加jquery.js引用，新增针对登录按钮编写方法发送ajax请求  
	spring-mvc.xml加入mvc声明，用于支持@ResponseBody  
	UserController新增登录方法用于响应ajax请求  
	登录动作接收到ajax请求后跳转index页面  
