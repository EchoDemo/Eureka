# Eureka

简单的eureka搭建，其中order和order2作为服务提供者，customer作为消费者，都是需要先向eurekaserver进行注册。这里还通过在customer当中加入loadbalance注解，实现了对order和order2的负载均衡访问（order和order2的区别仅仅是启动的端口不一样）。