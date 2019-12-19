# 优软风控项目SDK

## sdk接入说明

- 私服地址

```
<repository>
  <snapshots>
    <enabled>false</enabled>
  </snapshots>
  <id>release</id>
  <name>libs-release</name>
  <url>https://artifactory.uuzcc.cn/artifactory/libs-release</url>
</repository>
<repository>
  <snapshots />
  <id>snapshots</id>
  <name>libs-snapshot</name>
  <url>https://artifactory.uuzcc.cn/artifactory/libs-snapshot</url>
</repository>
```

- 版本引用

```
<dependency>
    <groupId>com.usoft.sdk</groupId>
    <artifactId>usoft-sdk-erm</artifactId>
    <version>1.0</version>
</dependency>
```

- 版本号地址

[snapshot 版本](https://artifactory.uuzcc.cn/artifactory/libs-snapshot/com/usoft/sdk/usoft-sdk-erm) 

[release 版本](https://artifactory.uuzcc.cn/artifactory/libs-release/com/usoft/sdk/usoft-sdk-erm)

## API文档地址

[API文档地址](https://document.usoftchina.com/erm)

## 使用示例地址

[使用示例地址](./src/test/java/com/usoft/sdk/erm)

## sdk开发规范

- 1、GitHub地址：[https://github.com/usoft-china/usoft-sdk-erm](https://github.com/usoft-china/usoft-sdk-erm)

-  2、当SDK开发完成后，合并代码入Master分支，并同步推送到GitHub地址

