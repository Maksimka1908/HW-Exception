public class Main {

    public static void main(String[] args) {
        String login = "java_skypro_go";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_7";

        try {
            Verification.verificationUser(login, password, confirmPassword);
            System.out.println("Регистрация прошла успешно!");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println("Ошибка при регистрации: " + e.getMessage());
        }
    }
}