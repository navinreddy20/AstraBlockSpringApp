package com.telusko.AstraBlockSpringApp.tokens;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface TokenRepository extends CassandraRepository<Token, String> {

    Optional<Token> findByAddress(String address);
}