package validator;

import java.lang.annotation.*;

/**
 * @Author: jiejiecool
 * @Description:
 * @Date: create in 2020/9/7 10:28
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NotNull {
}
