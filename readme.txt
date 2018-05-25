配置服务端的地址时，要配置全url路径（可以省略后面的？wsdl）
下面的两种配置方式都是正确的
<property name="address" value="http://localhost:8080/SpringWebserviceSever/ws/hello?wsdl" />
<property name="address" value="http://localhost:8080/SpringWebserviceSever/ws/hello" />

如果使用spring调取配置文件的时候，出现xml配置文件不能被成功识别到的时候，一般是要在web.xml里面去配置路径
有好几种配置方式，但是有时不是默认的applicationContent.xml也可以被成功识别,如本例中
<context-param>
    <param-name>contextConfigLocation</param-name>
    <param-value>classpath*:spring-client.xml</param-value>
  </context-param>