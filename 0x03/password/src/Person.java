
public class Person {

    public Person(){

    }

    public boolean checkUser(String usuario) {
        return !usuario.contains("[,.@$^?~=+\\-_\\/*\\-+.\\|])).{8,]");
    }

    public boolean checkPassword(String senha) {
        return senha.length() >= 8 && senha.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[-+_!@#$%^&*., ?]).+$");
    }


}