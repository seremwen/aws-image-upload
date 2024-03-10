package zw.nseremwe.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileServices {
    private final UserProfileDataAccessService userProfileDataAccessService;
    @Autowired
    public UserProfileServices(UserProfileDataAccessService userProfileDataAccessService) {
        this.userProfileDataAccessService = userProfileDataAccessService;
    }
    List<UserProfile> getUserProfiles(){
        return userProfileDataAccessService.getUserProfiles();
    }
}
