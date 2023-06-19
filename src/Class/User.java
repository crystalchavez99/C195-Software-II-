package Class;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.time.LocalDateTime;

public class User {
    private int user_id;
    private String user_name;
    private String password;
    private LocalDateTime create_date;
    private String created_by;
    private LocalDateTime last_update;
    private String last_updated_by;

    @FXML
    private Button login_button;

    public User(int user_id,String user_name,String password, LocalDateTime create_date, String created_by, LocalDateTime last_update,String last_updated_by){
        this.user_id = user_id;
        this.user_name = user_name;
        this.password = password;
        this.create_date = create_date;
        this.created_by = created_by;
        this.last_update = last_update;
        this.last_updated_by = last_updated_by;
    }

    public int getUser_id(){
        return user_id;
    }

    public void setUser_id(int user_id){
        this.user_id = user_id;
    }

    public String getUser_name(){
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreate_date() {
        return create_date;
    }

    public void setCreate_date(LocalDateTime create_date) {
        this.create_date = create_date;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public LocalDateTime getLast_update() {
        return last_update;
    }

    public void setLast_update(LocalDateTime last_update) {
        this.last_update = last_update;
    }

    public String getLast_updated_by() {
        return last_updated_by;
    }

    public void setLast_updated_by(String last_updated_by) {
        this.last_updated_by = last_updated_by;
    }

    public boolean login(String user_name, String password){
        if(this.user_name.equals(user_name) && this.password.equals(password)){
            return true;
        }
        return false;
    }

}
