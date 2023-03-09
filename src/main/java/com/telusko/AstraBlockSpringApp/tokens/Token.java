package com.telusko.AstraBlockSpringApp.tokens;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.math.BigInteger;
import java.time.Instant;

@Table(value = "tokens")
public class Token {

    @PrimaryKeyColumn(name = "address", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    @CassandraType(type = CassandraType.Name.TEXT)
    private String address;

    @PrimaryKeyColumn(name = "block_number", ordinal = 0, type = PrimaryKeyType.CLUSTERED)
    @CassandraType(type = CassandraType.Name.BIGINT)
    private BigInteger blockNumber;

    @Column("block_hash")
    @CassandraType(type = CassandraType.Name.TEXT)
    private String blockHash;

    @Column("block_timestamp")
    @CassandraType(type = CassandraType.Name.TIMESTAMP)
    private Instant blockTimestamp;

    @Column("decimals")
    @CassandraType(type = CassandraType.Name.INT)
    private int decimals;

    @Column("name")
    @CassandraType(type = CassandraType.Name.TEXT)
    private String name;

    @Column("symbol")
    @CassandraType(type = CassandraType.Name.TEXT)
    private String symbol;

    @Column("total_supply")
    @CassandraType(type = CassandraType.Name.TEXT)
    private String totalSupply;

    public Token() {
    }

    public BigInteger getBlockNumber() {
        return blockNumber;
    }
    public void setBlockNumber(BigInteger block_number) {
        this.blockNumber = block_number;
    }

    public String getBlockHash() {
        return blockHash;
    }

    public void setBlockHash(String block_hash) {
        this.blockHash = block_hash;
    }

    public Instant getBlockTimestamp() {
        return blockTimestamp;
    }

    public void setBlockTimestamp(Instant block_timestamp) {
        this.blockTimestamp = block_timestamp;
    }

    public int getDecimals() {
        return decimals;
    }

    public void setDecimals(int decimals) {
        this.decimals = decimals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getTotalSupply() {
        return totalSupply;
    }

    public void setTotalSupply(String total_supply) {
        this.totalSupply = total_supply;
    }
}
