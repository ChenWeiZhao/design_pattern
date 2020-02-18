package com.chenwz.design.refactor.after;

public interface IdGenerator {

    String generate() throws RandomIdGenerator.IdGenerationFailureException;
}
