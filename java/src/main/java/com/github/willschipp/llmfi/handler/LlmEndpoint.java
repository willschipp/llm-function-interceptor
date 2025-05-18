package com.github.willschipp.llmfi.handler;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class LlmEndpoint {
    
    @Value("${session.header:X-Project-ID}")
    private String sessionHeader;


    @PostMapping("/v1/completions")
    public Mono<Map<String,Object>> handlePrompt(@RequestBody Map<String,Object> prompt,@RequestHeader HttpHeaders httpHeaders) throws Exception {
        //look at the prompt and headers
        
        //get a set of tools from the MCP collection and add them

        return null;
    }
}
