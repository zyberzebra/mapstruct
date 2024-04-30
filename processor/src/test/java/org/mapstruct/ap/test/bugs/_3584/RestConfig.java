package org.mapstruct.ap.test.bugs._3584;

import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;

@MapperConfig
public interface RestConfig {
    @Mapping(target = "tenantId", source = "tenantId")
    @Mapping(target = "targetWillBeIgnore", source = "source.willBeIgnore")
    SiteDto convert(RestSiteDto source, String tenantId);
}

