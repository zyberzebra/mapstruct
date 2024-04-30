package org.mapstruct.ap.test.bugs._3584;

import org.junit.jupiter.api.extension.RegisterExtension;
import org.mapstruct.ap.testutil.ProcessorTest;
import org.mapstruct.ap.testutil.WithClasses;
import org.mapstruct.ap.testutil.runner.GeneratedSource;

import static org.assertj.core.api.Assertions.assertThat;

@WithClasses({
    RestConfig.class,
    RestSiteMapper.class,
    RestSiteDto.class,
    SiteDto.class
})
class RestSiteMapperTest {

    private final static String TENANT_ID = "testTenant";
    @RegisterExtension
    final GeneratedSource generatedSource = new GeneratedSource();

    @ProcessorTest
    void testMapper() {
        RestSiteDto restSiteDto = new RestSiteDto();
        restSiteDto.setWillBeIgnore( 1337 );

        SiteDto siteDto = RestSiteMapper.INSTANCE.convert( restSiteDto, TENANT_ID );

        assertThat( siteDto.getTargetWillBeIgnore() ).isEqualTo( 1337 );
    }

    @ProcessorTest
    void targetWillBeIgnoreShouldBeMappedFromInheritedConfig() {
        generatedSource.forMapper( RestSiteMapper.class )
            .content()
            .containsIgnoringWhitespaces( "siteDto.setTargetWillBeIgnore( source.getWillBeIgnore() );" );

    }
}