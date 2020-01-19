package com.tc.starter.format;

import com.alibaba.fastjson.JSON;

/**
 * @author taosh
 * @create 2020-01-16 14:27
 */
public class JsonFormatProcessor implements FormatProcessor {
    @Override
    public <T> String format(T obj) {
        return "JsonFormatProcessor:" + JSON.toJSONString(obj);
    }
}
