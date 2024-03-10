package zw.nseremwe.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/user-profile")
public class UserProfileController {
    private final UserProfileServices userProfileServices;
@Autowired
    public UserProfileController(UserProfileServices userProfileServices) {
        this.userProfileServices = userProfileServices;
    }

    @GetMapping
    public List<UserProfile> getUserProfiles(){
        return userProfileServices.getUserProfiles();
    }
}
