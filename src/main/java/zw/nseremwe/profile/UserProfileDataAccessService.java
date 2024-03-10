package zw.nseremwe.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import zw.nseremwe.datastore.FakeUserProfileDatastore;

import java.util.List;

@Repository
public class UserProfileDataAccessService {
    private final FakeUserProfileDatastore fakeUserProfileDatastore;
    @Autowired
    public UserProfileDataAccessService(FakeUserProfileDatastore fakeUserProfileDatastore) {
        this.fakeUserProfileDatastore = fakeUserProfileDatastore;
    }
    List<UserProfile> getUserProfiles(){
        return fakeUserProfileDatastore.getUserProfiles();
    }
}
