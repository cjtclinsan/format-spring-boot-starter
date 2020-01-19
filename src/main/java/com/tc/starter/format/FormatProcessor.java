package com.tc.starter.format;

/**
 * @author taosh
 * @create 2020-01-16 14:24
 */
public interface FormatProcessor {
    /**
     * 定义一个格式化的方法
     * @param obj
     * @param <T>
     * @return
     */
    <T> String format(T obj);
}
