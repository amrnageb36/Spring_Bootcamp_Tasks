package injectingProp;

public class dataBaseOperation {
    String url;
    String username;
    String password;

    public dataBaseOperation() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void save(Vehicle vehicle){
        System.out.println("saved into data base ");
        System.out.println("url: " + url+", username: " + username+", password: " + password);
        System.out.println("================================");
    }
}
