# cxf 生产代码
```shell
wsdl2java -keep -client -autoNameResolution -p org.example.wsdl -encoding utf-8  -d src\main\java http://localhost:8080/ws/hello?wsdl 
```
```shell
wsdl2java -keep -client -autoNameResolution -p org.example.rms -encoding utf-8  -d src\main\java http://192.168.66.148/_wmcs/certification/certification.asmx?wsdl
```

# 需要注意 不同版本的cxf 生成的代码不一样,一般1.8的用3.5.0即可