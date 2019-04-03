package com.cgt.util;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class MapToBeanUtils<T> {

    /**
     * List<Map>数据转换为JavaBean数据
     *
     * @param maps
     * @param beanClass
     * @return
     * @throws Exception
     */
    public List<T> ListMapToJavaBean(List<Map> maps, Class<T> beanClass) throws Exception {
        // 返回数据集合
        List<T> list = new ArrayList<T>();
        for (Map<String, Object> map : maps) {
            T t=MapToJavaBean(map,beanClass);
            list.add(t);
        }
        // 返回
        return list;
    }

    /**
     * List<Map>数据转换为JavaBean数据
     *
     * @param map
     * @param beanClass
     * @return
     * @throws Exception
     */
    public T MapToJavaBean(Map<String,Object> map, Class<T> beanClass) throws Exception {
        // 返回数据集合
        List<T> list = new ArrayList<T>();
        T t = beanClass.newInstance();
        BeanInfo beanInfo = Introspector.getBeanInfo(t.getClass());
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor property : propertyDescriptors) {
            String key = property.getName();// bean
            for (String mapKey : map.keySet()) {
                if (mapKey.replace("_", "").toLowerCase().equals(key.replace("_", "").toLowerCase())) {
                    Object value = map.get(mapKey);
                    Method setter = property.getWriteMethod();// 得到property对应的setter方法
                    Field[] fields = t.getClass().getDeclaredFields();
                    boolean v = false;
                    for (Field field : fields) {
                        String filedName = field.getName().replace("_", "").toLowerCase();
                        if (filedName.equals(key.replace("_", "").toLowerCase())) {
                            if (field.getType() == Integer.class || field.getType() == int.class) {
                                if (value != null) {
                                    setter.invoke(t, Integer.parseInt(value.toString()));
                                }
                            } else if (field.getType() == Float.class || field.getType() == float.class) {
                                if (value != null) {
                                    setter.invoke(t, Float.parseFloat(value.toString()));
                                }
                            } else if (field.getType() == Long.class || field.getType() == long.class) {
                                if (value != null) {
                                    setter.invoke(t, Long.parseLong(value.toString()));
                                }
                            } else if (field.getType() == Double.class || field.getType() == double.class) {
                                if (value != null) {
                                    setter.invoke(t, Double.parseDouble(value.toString()));
                                }
                            } else if (field.getType() == Short.class || field.getType() == short.class) {
                                if (value != null) {
                                    setter.invoke(t, Short.parseShort(value.toString()));
                                }
                            } else if (field.getType() == String.class) {
                                if (value != null) {
                                    setter.invoke(t, (Object) value.toString());
                                }
                            } else if (field.getType() == Date.class) {
                                if (value != null) {
                                    if (value.getClass() == String.class) {
                                        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                        setter.invoke(t, format.parse(value.toString()));
                                    } else {
                                        setter.invoke(t, value);
                                    }
                                }
                            } else if (field.getType() == Timestamp.class) {
                                if (value != null) {
                                    setter.invoke(t, value);
                                }
                            } else {
                                // 其他类型
                                if (value != null) {
                                    setter.invoke(t, value);
                                }
                            }
                            v = true;
                            continue;
                        }
                    }
                    if (v) {
                        continue;
                    }
                }
            }
        }
        // 返回
        return t;
    }

}
