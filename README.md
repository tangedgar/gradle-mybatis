# mybatis学习

数据库搭建

```sql
-- 创建数据库
create database `mybatis`;

-- 选中数据库
use mybatis;

-- 创建数据库
create table `user`(
    `id` int(20) auto_increment,
    `name` varchar(30) default null,
    `pwd` varchar(30),
    primary key (`id`)
)engine=InnoDB default charset=utf8;

-- 插入数据
insert into user values(1,'张三','123456'),
                       (2,'李四','654321'),
                       (3,'王五','456789');
```

