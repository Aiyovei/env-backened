package com.env.envbackend.Controller;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeepSeekController {

    @GetMapping("/queryAI")
    public String queryAI() {
        HttpResponse<String> response = Unirest.post("https://xiaoai.plus/v1/chat/completions")
                .header("Authorization", "Bearer sk-m0uvN3bd77oKS2PXuyPnS4hlPWpWErDdnGuIHtK7wOPR9aGR")
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"messages\": [\n" +
                        "        {\n" +
                        "            \"role\": \"system\",\n" +
                        "            \"content\": \"你是一个大语言模型机器人\"\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"role\": \"user\",\n" +
                        "            \"content\": \"你好\"\n" +
                        "        }\n" +
                        "    ],\n" +
                        "    \"stream\": false,\n" +
                        "    \"model\": \"gpt-3.5-turbo\",\n" +
                        "    \"temperature\": 0.5,\n" +
                        "    \"presence_penalty\": 0,\n" +
                        "    \"frequency_penalty\": 0,\n" +
                        "    \"top_p\": 1\n" +
                        "}")
                .asString();
        System.out.println(response.getBody());
        return response.getBody();
    }
}