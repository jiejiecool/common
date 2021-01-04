package validator;

import java.lang.reflect.Field;

/**
 * @Author: jiejiecool
 * @Description:
 * @Date: create in 2020/9/7 10:32
 */
public class ValidateRules<T> {
    public static String validateNotNull(Object obj, Class<?> tClass) throws IllegalAccessException {
        Field[] fields = tClass.getFields();
        for (Field field : fields) {
            field.setAccessible(true);
            NotNull[] annotationsByType = field.getAnnotationsByType(NotNull.class);
            if (annotationsByType.length > 0) {
                if (field.get(obj) == null) {
                    return field.getName() + "不能为空";
                }
            }
        }
        return "";
    }
}
