import java.util.ArrayList;
import java.util.List;

/**
 * 测试Git提交代码
 */
public class Bath {
   static class User {
        String name;
        String age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }
    }
    public static void main(String[] args) {
//        System.out.println("狗子，到哪儿了？");
        List<User> list = new ArrayList<User>();

//        list.forEach(info ->{info.setName("askdj")});

        User user1 = new User();
        user1.setName("aaa");
        user1.setAge("26");
        User user2 = new User();
        user2.setName("bbb");
        user2.setAge("26");
        User user3 = new User();
        user3.setName("ccc");
        user3.setAge("26");
        User user4 = new User();
        user4.setName("ddd");
        user4.setAge("26");

        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);

        list.forEach(p -> p.setName("xxxxxxxxx"));
//        for (User user : list) {
//            user.setName("eeee");
//        }

        for (User user : list) {
            System.out.println("=================="+ user.getName());
        }
    }
}
