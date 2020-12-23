加密

```
java -cp jasypt-1.9.2.jar org.jasypt.intf.cli.JasyptPBEStringEncryptionCLI input="xxx" password="xxxx" algorithm="PBEWithMD5AndDES"
```

建表

```
create database if not exists mall character set utf8mb4 COLLATE utf8mb4_general_ci;
```