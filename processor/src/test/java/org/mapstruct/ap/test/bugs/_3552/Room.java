package org.mapstruct.ap.test.bugs._3552;

import java.util.List;

public class Room {

    protected final List<String> photos;

    public Room(List<String> photos) {
        this.photos = photos;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public static class RoomBuilder {

        protected List<String> photos;

        public RoomBuilder photos(List<String> photos) {
            this.photos = photos;
            return this;
        }

        public Room build() {
            return new Room(photos);
        }

    }
}