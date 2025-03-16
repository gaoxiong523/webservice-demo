# cxf 生产代码
```shell
wsdl2java -keep -p org.example.wsdl -encoding utf-8  -d src\main\java http://localhost:8080/ws/hello?wsdl 
```

# 需要注意 不同版本的cxf 生成的代码不一样,一般1.8的用3.5.0即可