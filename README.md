# junit
> Junit For SpringBoot Test / Login Session

## 思路
> 类似爬虫登录

- 准备一个MockMvc实例
- 准备登录session
- 在需要权限的接口测试时，post/get过程中设置session

## 代码
> main/java 中存在的是一个简单的登录逻辑和登录与否测试接口
> test/java 中存在一些基础测试类、非正式发布的mian函数和测试类

### 测试基类
1. SpringTestBase
 
 这是一个为启动SpringBoot环境配置的抽象类，测试如果需要用到此环境可以继承此类
 
2. MockBase
 
 这是一个模拟器，继承自SpringTestBase，可以测试controller层的接口
 
3. LoginBase
 
 这个继承自MockBase，可以保留session，在测试时可以在perform中设置请求session

### 测试
1. IndexContrllerTest
 
 继承LoginBase，测试登录情况的返回

2. IndexContrller2Test
 
 继承MockBase，测试未登录情况的返回
