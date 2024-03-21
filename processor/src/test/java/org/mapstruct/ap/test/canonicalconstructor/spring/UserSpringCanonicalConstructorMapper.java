/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.canonicalconstructor.spring;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ap.test.canonicalconstructor.shared.UserDto;
import org.mapstruct.ap.test.canonicalconstructor.shared.UserEntity;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public abstract class UserSpringCanonicalConstructorMapper {

    private final ContactRepository contactRepository;
    private final AddressMapper addressMapper;

    public UserSpringCanonicalConstructorMapper(ContactRepository contactRepository, AddressMapper addressMapper) {
        this.contactRepository = contactRepository;
        this.addressMapper = addressMapper;
    }

    public UserDto map(UserEntity userEntity) {
        String phoneNumber = contactRepository.getUserPhoneNumber( userEntity.getUserId() );
        return map( userEntity, phoneNumber );
    }

    protected abstract UserDto map(UserEntity userEntity, String phoneNumber);

}