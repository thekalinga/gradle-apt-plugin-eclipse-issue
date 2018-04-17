package com.test;

import org.mapstruct.Mapper;

@Mapper
public interface Library {
    Second map(First first);
}
