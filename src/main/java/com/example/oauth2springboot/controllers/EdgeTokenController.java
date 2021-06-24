package com.example.oauth2springboot.controllers;

import com.example.oauth2springboot.models.Car;
import com.example.oauth2springboot.models.EdgeToken;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/edge-tokens")
public class EdgeTokenController {

    @RequestMapping("/{id}")
    public ResponseEntity<Object> getEdgeToken(@RequestHeader(value = "partner-id",required = false) String partnerId,@PathVariable("id") String edgeTokenId){
        EdgeToken edgeToken=new EdgeToken(
                edgeTokenId,
                "BankIssuedCard",
                partnerId,
                "9FD2ECF9-F743-6623-F29C-1D1F1A662643",
                "2FD2ECF9-G743-6623-F29C-1D1F1A662641",
                "InstrumentVerification",
                "CVV",
                "test-user-123"
        );
        return new ResponseEntity<>(edgeToken,HttpStatus.OK);
    }
}
