import java.util.ArrayList;

public class Users {
    // User repository
    private ArrayList<IUser> userList;

    public Users()
    {
        userList = new ArrayList<>();
    }
    // Create new user with type, name and password
    // user created with this method should be automatically added to userList;
    public IUser create(int type, String name, String password)
    {
        User temp = new User(type,name,password);
        return temp;
    }

    // Add new user to repository
    public void add(IUser user) {
        userList.add(user);
    }

    // Delete user from repository
    // Throw  RuntimeException if the user is not in the list
    public void remove(IUser user) throws RuntimeException {
        try{
            userList.remove(user);
        }
        catch (Exception e)
        {
            System.out.println("user is not in list");
        }
    }

    // Return true if the user is in the list
    public boolean exists(IUser user)
    {
        if(userList.indexOf(user)==-1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    // Return number of user in the list
    public int count()
    {
        return userList.size();
    }

    // Return number of user in the list, according to type
    public int countByType(int type)
    {
        int count=0;
        for(int i=0;i<userList.size();i++)
        {
            if(userList.get(i).getType()==type)
            {
                count++;
            }
        }
        return count;
    }
}
