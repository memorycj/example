package com.wn.framework.net.converter;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/**
 * @author tempest
 */
public final class StringConverterFactory extends Converter.Factory {

    public static StringConverterFactory create() {
        return new StringConverterFactory();
    }

    private StringConverterFactory() {
    }

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        if (String.class.equals(type)) {
            //是则创建一个Converter返回转换数据
            return (Converter<ResponseBody, String>) ResponseBody::string;
        }
        return super.responseBodyConverter(type, annotations, retrofit);
    }
}