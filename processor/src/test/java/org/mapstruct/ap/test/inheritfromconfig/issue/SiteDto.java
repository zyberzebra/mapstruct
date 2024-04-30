package org.mapstruct.ap.test.inheritfromconfig.issue;

public class SiteDto {
    long targetWillBeIgnore;
    String tenantId;
    String qualifiedField;

    public SiteDto() {
    }

    public long getTargetWillBeIgnore() {
        return this.targetWillBeIgnore;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public String getQualifiedField() {
        return this.qualifiedField;
    }

    public void setTargetWillBeIgnore(long targetWillBeIgnore) {
        this.targetWillBeIgnore = targetWillBeIgnore;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public void setQualifiedField(String qualifiedField) {
        this.qualifiedField = qualifiedField;
    }

    public boolean equals(final Object o) {
        if ( o == this ) {
            return true;
        }
        if ( !( o instanceof SiteDto ) ) {
            return false;
        }
        final SiteDto other = (SiteDto) o;
        if ( !other.canEqual( (Object) this ) ) {
            return false;
        }
        if ( this.getTargetWillBeIgnore() != other.getTargetWillBeIgnore() ) {
            return false;
        }
        final Object this$tenantId = this.getTenantId();
        final Object other$tenantId = other.getTenantId();
        if ( this$tenantId == null ? other$tenantId != null : !this$tenantId.equals( other$tenantId ) ) {
            return false;
        }
        final Object this$qualifiedField = this.getQualifiedField();
        final Object other$qualifiedField = other.getQualifiedField();
        if ( this$qualifiedField == null ? other$qualifiedField != null :
            !this$qualifiedField.equals( other$qualifiedField ) ) {
            return false;
        }
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SiteDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $targetWillBeIgnore = this.getTargetWillBeIgnore();
        result = result * PRIME + (int) ( $targetWillBeIgnore >>> 32 ^ $targetWillBeIgnore );
        final Object $tenantId = this.getTenantId();
        result = result * PRIME + ( $tenantId == null ? 43 : $tenantId.hashCode() );
        final Object $qualifiedField = this.getQualifiedField();
        result = result * PRIME + ( $qualifiedField == null ? 43 : $qualifiedField.hashCode() );
        return result;
    }

    public String toString() {
        return "SiteDto(targetWillBeIgnore=" + this.getTargetWillBeIgnore() + ", tenantId=" + this.getTenantId() +
            ", qualifiedField=" + this.getQualifiedField() + ")";
    }
}
