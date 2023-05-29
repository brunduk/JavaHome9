
public class main {
    public static void main(String[] args) {
        post post = new post();
        post.name = "Иван";
        post.passport = "4004 456235";
        post.patronymic = "Алексеевич";
        post.phone = "8-911-777-66-22";
        post.surname = "Яблонев";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 2;
        post.birthday.year = 2000;

    }

}
