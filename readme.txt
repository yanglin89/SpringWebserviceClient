���÷���˵ĵ�ַʱ��Ҫ����ȫurl·��������ʡ�Ժ���ģ�wsdl��
������������÷�ʽ������ȷ��
<property name="address" value="http://localhost:8080/SpringWebserviceSever/ws/hello?wsdl" />
<property name="address" value="http://localhost:8080/SpringWebserviceSever/ws/hello" />

���ʹ��spring��ȡ�����ļ���ʱ�򣬳���xml�����ļ����ܱ��ɹ�ʶ�𵽵�ʱ��һ����Ҫ��web.xml����ȥ����·��
�кü������÷�ʽ��������ʱ����Ĭ�ϵ�applicationContent.xmlҲ���Ա��ɹ�ʶ��,�籾����
<context-param>
    <param-name>contextConfigLocation</param-name>
    <param-value>classpath*:spring-client.xml</param-value>
  </context-param>