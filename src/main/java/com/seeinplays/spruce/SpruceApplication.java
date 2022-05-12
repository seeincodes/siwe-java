package com.seeinplays.spruce;

import com.seeinplays.spruce.models.Message;
import com.seeinplays.spruce.services.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.EthBlockNumber;
import org.web3j.protocol.core.methods.response.EthGasPrice;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;

import java.io.IOException;

@SpringBootApplication
public class SpruceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpruceApplication.class, args);

//		System.out.println("Connecting to Ethereum ...");
//		Web3j web3 = Web3j.build(new HttpService("http://localhost:7545"));
//		System.out.println("Successfully connected to Ethereum");
//
//		try {
//			// web3_clientVersion returns the current client version.
//			Web3ClientVersion clientVersion = web3.web3ClientVersion().send();
//
//			//eth_blockNumber returns the number of most recent block.
//			EthBlockNumber blockNumber = web3.ethBlockNumber().send();
//
//			//eth_gasPrice, returns the current price per gas in wei.
//			EthGasPrice gasPrice =  web3.ethGasPrice().send();
//
//			MessageService service = new MessageService();
//
//			Message message = new Message();
//			message.setVersion(clientVersion.getWeb3ClientVersion());
//
//			service.generateMessage(message);
//
//			// Print result
//			System.out.println("Client version: " + clientVersion.getWeb3ClientVersion());
//			System.out.println("Block number: " + blockNumber.getBlockNumber());
//			System.out.println("Gas price: " + gasPrice.getGasPrice());
//
//		} catch(IOException ex) {
//			throw new RuntimeException("Error whilst sending json-rpc requests", ex);
//		}

	}

//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return builder.sources(SpruceApplication.class);
//	}

}
