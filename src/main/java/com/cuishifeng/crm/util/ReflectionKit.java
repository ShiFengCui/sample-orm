/*
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.cuishifeng.crm.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.cuishifeng.crm.DaoHelper;

/**
 * @author cuishifeng <cuishifeng@kuaishou.com>
 * Created on 2022-07-12
 */
public class ReflectionKit {

    /**
     * log
     */
    protected static final Log logger = LogFactory.getLog(DaoHelper.class);

    /**
     * <p>
     * 反射对象获取泛型
     * </p>
     *
     * @param clazz 对象
     * @param index 泛型所在位置
     * @return Class
     */
    public static Class<?> getSuperClassGenericType(final Class<?> clazz, final int index) {
        Type type = clazz.getGenericSuperclass();
        ParameterizedType p = (ParameterizedType) type;
        return (Class<?>) p.getActualTypeArguments()[index];
    }
}
