package com.sevenlist.jpaplayground.datamodel

import groovy.transform.ToString

import javax.persistence.Entity

@Entity
@ToString(includeSuper = true, includeNames = true, includeFields = true, includePackage = false)
class E extends D {

    String secondName = 'e'
}
