package easy;


/**
 * @Author: jiejiecool
 * @Description:
 * @Date: 2020/2/12 22:00
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 *
 * A defanged IP address replaces every period "." with "[.]".
 *
 * Example 1:
 *
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 * Example 2:
 *
 * Input: address = "255.100.50.0"
 * Output: "255[.]100[.]50[.]0"
 */
public class Class1108 {
    public String defangIPaddr(String address) {
        String[] split = address.split("\\.");
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < split.length-1; i++) {
            s.append(split[i]) .append("[.]");
        }
        s.append(split[split.length-1]);

        return s.toString();
    }

    public void test() {
        System.out.println(defangIPaddr("1.1.1.1"));
        System.out.println(defangIPaddr("255.100.50.0"));
    }

}
