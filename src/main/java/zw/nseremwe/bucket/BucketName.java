package zw.nseremwe.bucket;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum BucketName {
    PROFILE_IMAGE("ngoni-image-upload");
    private final String bucketName;
}
