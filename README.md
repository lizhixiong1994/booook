## 个人博客主页
### http://bigger.masteryee.com 
### ps：平时工作比较忙，弄这个的时间不多，开始前后都是自己一点点写出来的，时间都是挤出来的。网站bug多多，不过基本的功能实现了。能用就行。。。。
### 技术框架：
~~~
//个人博客简介
基本栏目：
1：首页：前端博客文章的页面与展示
2：写博：博客文章编辑与创建，markdown的风格编辑。
3：图库：负责文章图片的保存与修改；
4：登录功能

// 使用到的主要技术
SpringBoot+Mybaits+mysql

//当然还用到了其他的技术
redis：
	1：用来充当队列服务器，简单的处理一些下发的图库的图片，不过基于功能未完成，暂时就是闲置状态。对于队列服务器来说，可以用其他的来替代，
		工作中接触到的队列服务器是Disqueue，不过这队列服务用的人不是特别多
	2：用来保存用户登录信息，简单的来说，就是用来缓存session，session中还有保存用户信息。模块虽然小，但是梦想是有的。
ngix：
	1：域名是朋友，然后为了简单的模拟一下集群的效果，特地让朋友开了一个二级域名。代理到我的服务器，然后本地再开两个端口跑工程用nginx代理
	（ps：毕竟很少弄这个，弄一个出来费时间）
//自己写的模块
lzx-commos：
	CURD框架，通用的Service，DAO，Mapper。利用sqlSession读取Mapper的resultMap，配合mybatis的Ognl语法动态生成sql语句。
lzx-dynamic：
	重写关键类，实现动态加载切换数据源。以及配合atomic，可以实现分布式事务管理；
~~~
