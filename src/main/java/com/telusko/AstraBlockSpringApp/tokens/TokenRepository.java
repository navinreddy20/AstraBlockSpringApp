package com.telusko.AstraBlockSpringApp.tokens;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

/**
 * Working with Token
 */
@Repository
public interface TokenRepository extends CassandraRepository<Token, String> {

    /**
     * Address is the PK of the table
     * @param address
     *      address
     * @return
     *      token is exists
     */
    Optional<Token> findByAddress(String address);

    @Query(allowFiltering = true)
    List<Token> findOneByBlockNumber(long blockNumber);



}