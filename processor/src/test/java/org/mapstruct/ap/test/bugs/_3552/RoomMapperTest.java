package org.mapstruct.ap.test.bugs._3552;

import org.mapstruct.ap.testutil.ProcessorTest;
import org.mapstruct.ap.testutil.WithClasses;

import static org.assertj.core.api.Assertions.assertThat;

@WithClasses(  {
    Room.class,
    RoomMapper.class,
} )
public class RoomMapperTest {

    @ProcessorTest
    void asdf(){
        Room model = new Room(null);
        Room.RoomBuilder builder = new Room.RoomBuilder();
        Room room = RoomMapper.INSTANCE.updateModelFull( model,builder);

        assertThat(room.photos).isNull();
    }

}
