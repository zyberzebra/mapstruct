package org.mapstruct.ap.test.inheritfromconfig.issue;

public class RestSiteDto {
    long willBeIgnore;

    public RestSiteDto() {
    }

    public long getWillBeIgnore() {
        return this.willBeIgnore;
    }

    public void setWillBeIgnore(long willBeIgnore) {
        this.willBeIgnore = willBeIgnore;
    }

    public boolean equals(final Object o) {
        if ( o == this ) {
            return true;
        }
        if ( !( o instanceof RestSiteDto ) ) {
            return false;
        }
        final RestSiteDto other = (RestSiteDto) o;
        if ( !other.canEqual( (Object) this ) ) {
            return false;
        }
        if ( this.getWillBeIgnore() != other.getWillBeIgnore() ) {
            return false;
        }
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RestSiteDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $willBeIgnore = this.getWillBeIgnore();
        result = result * PRIME + (int) ( $willBeIgnore >>> 32 ^ $willBeIgnore );
        return result;
    }

    public String toString() {
        return "RestSiteDto(willBeIgnore=" + this.getWillBeIgnore() + ")";
    }
}
