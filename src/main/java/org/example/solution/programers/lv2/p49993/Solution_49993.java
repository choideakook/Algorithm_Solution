package org.example.solution.programers.lv2.p49993;

/**
 * 스킬트리
 * skill = 선행 스킬 순서 ( 1 ~ 26 )
 *
 * skill_trees = usr made skill tree ( 1 ~ 20 )
 * index ( 2 ~ 26 )
 */

public class Solution_49993 {
    String[] split;
    int ski;

    public int solution(String skill, String[] skill_trees) {
        split = skill.split("");
        int answer = 0;

        for (int i = 0; i < skill_trees.length; i++) {
            ski = skill_trees[i].indexOf(split[0]);

            if (ski == -1) {
                if (whenNoSkill(skill_trees[i], 1)) answer++;
            }
            else {
                if (whenIncludeSkill(skill_trees[i])) answer++;
            }
        }
        return answer;
    }

    private boolean whenIncludeSkill(String skill_trees) {
        for (int i = 1; i < split.length; i++) {
            int skt = skill_trees.indexOf(split[i]);

            if (skt == -1)
                return whenNoSkill(skill_trees, i);

            if (ski < skt) ski = skt;
            else return false;
        }
        return true;
    }

    boolean whenNoSkill(String skill_trees, int index) {
        for (int i = index; i < split.length; i++) {
            int skt = skill_trees.indexOf(split[i]);

            if (skt != -1) return false;
        }
        return true;
    }
}