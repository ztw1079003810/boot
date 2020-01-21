package com.xdclass.springboot.xdclass;

import io.swagger.annotations.ApiParam;

public class User {


    @ApiParam(name = "name", value = "name", defaultValue = "name")
    private String name;
    @ApiParam(name = "", value = "", defaultValue = "")
    private String id;
    @ApiParam(name = "", value = "", defaultValue = "")
    private String age;

    public static void main(String[] args) {
        String json = "{\n" +
                "  \"userName\":\"zhangsan\",\n" +
                "  \"id\":\"7900\",\n" +
                "  \"age\":18\n" +
                "}";

    }

}
