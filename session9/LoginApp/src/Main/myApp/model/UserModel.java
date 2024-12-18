package Main.myApp.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class UserModel {
    private String userName,password,country,programmingLanguage,operatingSystem;
}
