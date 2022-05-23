package com.ant.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1、整合mybatis-plus
 *  1）、导入依赖
 *  <!--mybatis-plus-->
*    <dependency>
*       <groupId>com.baomidou</groupId>
*       <artifactId>mybatis-plus-boot-starter</artifactId>
*       <version>3.3.1</version>
*    </dependency>
 *  2）、配置
 *      ① 配置数据源
 *          i） 导入数据库的驱动
 *                  <!--Mysql驱动-->
 *                  <dependency>
 *                      <groupId>mysql</groupId>
 *                      <artifactId>mysql-connector-java</artifactId>
 *                      <version>8.0.17</version>
 *                  </dependency>
 *          ii）在application.yml配置数据相关信息
 *      ② 配置MyBatis-Plus
 *          i）在主启动类上加MapperScan注解告诉其mapper接口在哪定义的
 *          ii）告诉mybatis-plus映射文件在哪里
 *
 *
 */
@EnableDiscoveryClient
@MapperScan("com.ant.gulimall.product.dao")
@SpringBootApplication
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
