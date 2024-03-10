package zw.nseremwe.profile;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
import java.util.UUID;
@Getter
@Setter
public class UserProfile {
    private UUID userProfileId;
    private  String username;
    private  String userProfileImageLink;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProfile that = (UserProfile) o;
        return Objects.equals(userProfileId, that.userProfileId) && Objects.equals(username, that.username) && Objects.equals(userProfileImageLink, that.userProfileImageLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userProfileId, username, userProfileImageLink);
    }
}
