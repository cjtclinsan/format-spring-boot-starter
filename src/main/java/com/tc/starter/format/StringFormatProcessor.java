package com.tc.starter.format;

/**
 * @author taosh
 * @create 2020-01-16 14:26
 */
public class StringFormatProcessor implements FormatProcessor {
    @Override
    public <T> String format(T obj) {
        return "StringFormatProcessor:" + obj.toString();
    }
}
