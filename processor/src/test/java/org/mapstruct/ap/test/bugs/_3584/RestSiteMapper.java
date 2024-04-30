package org.mapstruct.ap.test.bugs._3584;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper(config = RestConfig.class)
public interface RestSiteMapper {

    RestSiteMapper INSTANCE = Mappers.getMapper( RestSiteMapper.class );

    @InheritConfiguration
    @Mapping(target = "qualifiedField", source = "source", qualifiedByName = "defaultQualifiedField")
    SiteDto convert(RestSiteDto source, String tenantId);

    @Named("defaultQualifiedField")
    default String defaultQualifiedField(RestSiteDto source) {
        //do something
        return "defaultStuff";
    }
}