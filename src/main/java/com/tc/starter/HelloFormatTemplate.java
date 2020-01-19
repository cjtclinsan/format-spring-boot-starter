package com.tc.starter;

import com.tc.starter.autoconfiguration.HelloProperties;
import com.tc.starter.format.FormatProcessor;

/**
 * @author taosh
 * @create 2020-01-16 14:29
 */
public class HelloFormatTemplate {
    private FormatProcessor formatProcessor;

    private HelloProperties helloProperties;

    public HelloFormatTemplate(FormatProcessor formatProcessor, HelloProperties helloProperties) {
        this.formatProcessor = formatProcessor;
        this.helloProperties = helloProperties;
    }

    public <T> String doFormat(T obj){
        System.out.println(formatProcessor);

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("begin:Execute format").append("<br/>");
        stringBuilder.append("HelloProperties:").append(formatProcessor.format(helloProperties.getInfo())).append("<br/>");
        stringBuilder.append("Obj format result:").append(formatProcessor.format(obj)).append("\n");

        return stringBuilder.toString();
    }
}
