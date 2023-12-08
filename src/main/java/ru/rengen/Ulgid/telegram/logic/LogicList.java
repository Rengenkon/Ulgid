package ru.rengen.Ulgid.telegram.logic;

import lombok.Getter;

import java.util.Map;

@Getter
public abstract class LogicList {
//    protected String state;
    protected Map<String, Logic> map;
}
