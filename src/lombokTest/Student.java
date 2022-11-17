package lombokTest;

import inheritance.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public @Data class Student {
    private String reg_ID;
    private String first_name;
    private String mid_name;
    private String last_name;
    private Gender gender;
    private String phone_number;
    private String email;

}
