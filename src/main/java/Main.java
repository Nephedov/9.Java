import ru.netology.json.Post;

public class Main {

    public static void main(String[] args) {
        Post post = new Post();

        post.birthday.day = 20;
        post.birthday.month = 7;
        post.birthday.year = 1993;
        post.name = "Mikhail";
        post.passport = "3914№608787";
        post.patronymic = "Aleksandrovich";
        post.phone = "+7(985)094-74-04";
        post.surname = "Nefyodov";
        post.subscription = true;

    }
}
