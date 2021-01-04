package validator;

/**
 * @Author: jiejiecool
 * @Description:
 * @Date: create in 2020/9/7 10:31
 */
public class Validators {
    public static String validate(Object obj) throws IllegalAccessException {
        Class<?> aClass = obj.getClass();
        String s = ValidateRules.validateNotNull(obj, obj.getClass());
        System.out.println(s);
        return s;
    }

    public static void main(String[] args) throws IllegalAccessException {
        User user = new User();
        System.out.println(validate(user));
    }
}
