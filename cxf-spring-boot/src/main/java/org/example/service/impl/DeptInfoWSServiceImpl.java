package org.example.service.impl;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.example.service.WSService;
import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;


@Service
@WebService
public class DeptInfoWSServiceImpl implements WSService {


    @WebMethod
    @WebResult(name = "deptInfo")
    @Override
    public String getInfo() {
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject ;
        for (int i = 0; i < 5; i++) {
            jsonObject= new JSONObject();
            jsonObject.put("dept name", "name"+i);
            jsonObject.put("dept age", i);
            jsonArray.add(jsonObject);
        }
        return jsonArray.toJSONString();
    }

    @WebMethod
    @WebResult(name = "resultName")
    @Override
    public String sayHello(@WebParam (name = "name") String name) {
        return String.format("dept WSService Hello %s",name);
    }
}
