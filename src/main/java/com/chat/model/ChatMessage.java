package com.chat.model;


import lombok.*;

@NoArgsConstructor
@Data
public class ChatMessage {

    private Long id;
    private String sender;
    private String content;
}
