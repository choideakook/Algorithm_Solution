package org.example.solution.baekjoon.dfs_bfs.b2331;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main_2331Test {
    @Test
    void name() {
        List<String> list = new ArrayList<>();

        list.add("ss");
        list.add("ss");

        list.remove("ss");

        System.out.println(list.size());
    }

    @Test
    void name1() {
        Map<String, Integer> map = new HashMap<>();

        Integer ss = map.get("ss");

        System.out.println(ss > 3);
    }
}