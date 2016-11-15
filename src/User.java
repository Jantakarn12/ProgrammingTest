public class User implements IUser {

    protected String name;
    protected String password;
    protected int type;


    public  String passwordform = "^[a-zA-Z][a-zA-Z0-9]{12,}";




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
        if(name.equals(""))
        {
            System.out.print("Wrong username");
            return null;
        }
        else if (name.matches("^[a-zA-Z][a-zA-Z0-9]{7,}$")) {
            this.name = name;
            return this.name;
        }
        else
        {
            return this.name;
        }
    }

    @Override
    public String setPassword(String password) {
        if(password.equals(""))
        {
            System.out.print("Wrong password");
            return this.password;
        }
        else if(password.matches("^(?=.*[a-zA-Z])(?=.*[a-zA-Z0-9]){12,}$")){
            this.password = password;
            return this.password;
        } else {
            System.out.print("Wrong password");
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

