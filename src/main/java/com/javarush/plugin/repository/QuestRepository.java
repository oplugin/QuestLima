package com.javarush.plugin.repository;


import com.javarush.plugin.entity.Quest;
import com.javarush.plugin.entity.Role;
import com.javarush.plugin.entity.User;

import java.util.stream.Stream;

public class QuestRepository extends BaseRepository<Quest>{



    @Override
    public Stream<Quest> find(Quest pattern) {
        return map.values()
                .stream()
                .filter(Quest -> nullOrEquals(pattern.getId(), Quest.getId()))
                .filter(Quest -> nullOrEquals(pattern.getName(), Quest.getName()))
                .filter(Quest -> nullOrEquals(pattern.getText(), Quest.getText()))
                .filter(Quest -> nullOrEquals(pattern.getStartQuestionId(), Quest.getStartQuestionId()));
    }
}
