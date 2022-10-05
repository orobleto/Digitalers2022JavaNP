package com.educacionit.jdbc;

import com.educacionit.entidades.GenericEntity;

public interface DAO<E extends GenericEntity> extends GenericDAO<E, Long> {

}
