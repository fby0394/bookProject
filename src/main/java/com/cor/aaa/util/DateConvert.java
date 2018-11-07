package com.cor.aaa.util;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * String时间格式类型转换为Date类型
 */
// <需要传唤的类型, 转换后的数据类型>
@Component
public class DateConvert implements Converter<String, Date> {

	String[] str = { "yyyy-MM-dd hh:mm:ss", "yyyy-MM-dd",
			"yyyy/MM/dd hh:mm:ss", "yyyy/MM/dd", "hh:mm:ss" };

	@Override
	public Date convert(String arg0) {
		for (int i = 0; i < str.length; i++) {
			SimpleDateFormat sdf = new SimpleDateFormat(str[i]);
			try {
				return sdf.parse(arg0);
			} catch (ParseException e) {
			}
		}
		return null;
	}

}
