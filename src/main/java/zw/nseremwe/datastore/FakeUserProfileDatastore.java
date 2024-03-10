package zw.nseremwe.datastore;

import org.springframework.stereotype.Repository;
import zw.nseremwe.profile.UserProfile;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDatastore {
    private static final List<UserProfile> USER_PROFILES= new ArrayList<>();
    static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(),"ngoni",null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(),"ngoni2",null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(),"ngoni3",null));
    }
    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
