package validator;

/**
 * @Author: jiejiecool
 * @Description:
 * @Date: create in 2020/9/7 10:30
 */
public class User {
    @NotNull
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
