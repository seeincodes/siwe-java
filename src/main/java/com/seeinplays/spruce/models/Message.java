package com.seeinplays.spruce.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.web3j.abi.datatypes.Address;

import java.net.URI;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    String domain;
    Address address;
    URI uri;
    String version;

    String statement;
    String nonce;
    int chainId;

    LocalDateTime issuedAt;
    LocalDateTime expirationTime;
    LocalDateTime notBefore;

    String requestID;
    List<URL> resources;
}
