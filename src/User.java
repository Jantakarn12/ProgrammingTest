public class User implements IUser {

    protected String name;
    protected String password;
    protected int type;

    public User(int type, String name, String password) {
        this.type = type;
        setName(name);
        setPassword(password);
    }

    @Override
    public String getName() {

        return name;
    }

    @Override
    public String setName(String name) {
        if (name.matches("^[a-zA-Z][a-zA-Z0-9]{7,}$")) {
            this.name = name;

            return this.name;

        } else if (name.matches("")) {
            System.out.print("Wrong username");
            return null;

        } else {
            return this.name;
        }
    }

    @Override
    public String setPassword(String password) {

        if (password.matches("^[a-zA-Z][a-zA-Z0-9]{12,}")) {
            this.password = password;

            return this.password;

        } else {
            return this.password;
        }
    }

    @Override
    public boolean isPasswordCorrect(String password) {
        if (this.password.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getType() {

        return type;
    }
}

