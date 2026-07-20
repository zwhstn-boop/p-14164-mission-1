package com.back.domain.wiseSaying.wiseSaying.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QWiseSaying is a Querydsl query type for WiseSaying
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QWiseSaying extends EntityPathBase<WiseSaying> {

    private static final long serialVersionUID = 1432183702L;

    public static final QWiseSaying wiseSaying = new QWiseSaying("wiseSaying");

    public final StringPath author = createString("author");

    public final StringPath content = createString("content");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public QWiseSaying(String variable) {
        super(WiseSaying.class, forVariable(variable));
    }

    public QWiseSaying(Path<? extends WiseSaying> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWiseSaying(PathMetadata metadata) {
        super(WiseSaying.class, metadata);
    }

}

