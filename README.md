# Sign in with Ethereum using Java

## Description
Using the EIP-4361 standards to create a Sign-In with Ethereum (siwe) message using Java. In order to connect to the Ethereum network, we need to use the Web3J library.

## How to Install and Run the Project
Run the SpringBoot application then either use the commandline or Postman <br>
-```curl localhost:8080/sign_in
-H "Content-Type: application/json"
-d {
"domain":"<domain>",
"address":"<Wallet Address>",
"uri":"<URI>"
}``` <br>
-create a Postman call with Post and a JSON body of
```
{
    "domain":"<domain>",
    "address":"<Wallet Address>",
    "uri":"<URI>"
}
```

## Reference Documents
https://github.com/spruceid/siwe-go <br>
https://eips.ethereum.org/EIPS/eip-4361
https://kauri.io/#communities/Java%20Ethereum/connecting-to-an-ethereum-client-with-java-eclips/#_top


