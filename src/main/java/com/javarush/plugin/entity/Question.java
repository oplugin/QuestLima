package com.javarush.plugin.entity;

import lombok.*;

import java.util.ArrayList;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Question implements AbstractEntity{

    private Long id;
    private Long questId;
    private String text;
    private final Collection<Answer> answers = new ArrayList<>();
    private final Collection<GameState> gameStates = new ArrayList<>();

    public String getImage() {return "quest : " + id;}
}
