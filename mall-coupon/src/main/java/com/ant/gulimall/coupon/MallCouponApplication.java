package com.ant.gulimall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1、如何使用Nacos作为配置中心统一管理配置
 *  1）引入依赖
 *      <dependency>
 *          <groupId>com.alibaba.cloud</groupId>
 *          <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *      </dependency>
 *  2）创建一个bootstrap.properties
 *      spring.application.name=mall-coupon
 *      spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 *  3）需要给配置中心默认添加一个叫 数据集（Data Id）gulimall-coupon.properties。默认规则，应用名.properties
 *  4）给 应用名.properties 添加任何配置
 *  5）动态获取配置
 *      @RefreshScope：动态获取并刷新配置
 *      @Value("${配置项的名}")：获取到配置
 *      如果配置中心和当前应用的配置文件中都配置了相同的项，优先使用配置中心的配置。
 *
 * 2、细节
 *  1）命名空间
 *      默认：public（保存空间）；默认新增的所有配置都在public空间
 *      i)、开发、测试、生产，利用命名空间来做化境隔离
 *          注意：在bootstrap.properties文件中配置上，需要使用哪个命名空间下的配置
 *              spring.cloud.nacos.config.namespace=6bcf753e-0daf-4a6f-a210-1067bdf2ab1f（命名空间的ID）
 *      ii)、每一个微服务之间互相隔离配置，每一个微服务都创建自己的命名空间，只加载自己命名空间下的所有配置
 *  2）配置集
 *      配置的集合就叫配置集
 *  3）配置集ID
 *      类似文件名
 *      Nacos配置管理中的Data ID即为配置集ID
 *  4）配置分组
 *      默认所有的配置集都属于：DEFAULT_GROUP
 *      可以自己创建分组，当要读取指定分组中的配置文件时，使用如下指定分组名
 *          spring.cloud.nacos.config.group=dev（分组名）
 *
 *  项目中的使用：每个微服务创建自己的命名空间，使用配置分组区分环境：dev，test，prod
 *
 *  3、同时加载多个配置集
 *      1）、微服务任何配置信息，任何配置文件都可以放在配置中心中
 *      2）、只需要在bootstrap.properties说明加载配置中心中哪些配置文件即可
 *      3）、@Value，@ConfigurationProperties...
 *          以前配置中心有的优先使用配置中心的
 */

@EnableDiscoveryClient  //放入Nacos注册中心
@MapperScan("com.ant.gulimall.coupon.dao")
@SpringBootApplication
public class MallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallCouponApplication.class, args);
    }

}
