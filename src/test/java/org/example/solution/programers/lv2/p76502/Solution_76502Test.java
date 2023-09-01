package org.example.solution.programers.lv2.p76502;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_76502Test {
    @Test
    void no() {
        Solution_76502 S = new Solution_76502();
        assertThat(S.solution("")).isEqualTo(0);
    }
    @Test
    void no1() {
        Solution_76502 S = new Solution_76502();
        assertThat(S.solution("[](){}")).isEqualTo(3);
    }
    @Test
    void no2() {
        Solution_76502 S = new Solution_76502();
        assertThat(S.solution("}]()[{")).isEqualTo(2);
    }
    @Test
    void no3() {
        Solution_76502 S = new Solution_76502();
        assertThat(S.solution("[)(]")).isEqualTo(0);
    }
    @Test
    void no4() {
        Solution_76502 S = new Solution_76502();
        assertThat(S.solution("}}}")).isEqualTo(0);
    }
    @Test
    void no5() {
        Solution_76502 S = new Solution_76502();
        assertThat(S.solution("(((")).isEqualTo(0);
    }
    @Test
    void no6() {
        Solution_76502 S = new Solution_76502();
        assertThat(S.solution("}")).isEqualTo(0);
    }
    @Test
    void no7() {
        Solution_76502 S = new Solution_76502();
        Solution_76502_answer A = new Solution_76502_answer();

        assertThat(S.solution("{(})")).isEqualTo(0);
        assertThat(A.solution("{(})")).isEqualTo(0);
    }
    @Test
    void no8() {
        Solution_76502 S = new Solution_76502();
        assertThat(S.solution("[{()}]")).isEqualTo(1);
    }

    @Test
    void no9() {
        Solution_76502 S = new Solution_76502();
        assertThat(S.solution("()[()()]")).isEqualTo(2);
    }
    @Test
    void no002() {
        Solution_76502_answer S1 = new Solution_76502_answer();
        Solution_76502 S2 = new Solution_76502();

        String param1 = "{[()]}{{[()]}}";
        String param2 = "()[]{[{()}]}({[]})";
        String param3 = "(({[]}))[]{[()]}";
        String param4 = "{}()[({})]{[]}";
        String param5 = "[()]{()}[{}]{}()";

        assertThat(S1.solution(param1)).isEqualTo(S2.solution(param1));
        assertThat(S1.solution(param2)).isEqualTo(S2.solution(param2));
        assertThat(S1.solution(param3)).isEqualTo(S2.solution(param3));
        assertThat(S1.solution(param4)).isEqualTo(S2.solution(param4));
        assertThat(S1.solution(param5)).isEqualTo(S2.solution(param5));
    }
    @Test
    void no003() {
        Solution_76502_answer S1 = new Solution_76502_answer();
        Solution_76502 S2 = new Solution_76502();

        String param1 = "(})}[)]{()}(";
        String param2 = "{})]{[{([)}[({[()]})[{[()]}{([{}";
        String param3 = "({[){[{[(]{]{(]}{[({([){(]{[{){[[";
        String param4 = ")}]}]{{)([}[{{[{)}]}[(]({[{]{(}}";
        String param5 = "(}[)([{]{)]{)}}}([(){}]";

        assertThat(S1.solution(param1)).isEqualTo(S2.solution(param1));
        assertThat(S1.solution(param2)).isEqualTo(S2.solution(param2));
        assertThat(S1.solution(param3)).isEqualTo(S2.solution(param3));
        assertThat(S1.solution(param4)).isEqualTo(S2.solution(param4));
        assertThat(S1.solution(param5)).isEqualTo(S2.solution(param5));
    }
    @Test
    void no004() {
        Solution_76502_answer S1 = new Solution_76502_answer();
        Solution_76502 S2 = new Solution_76502();

        String param1 = "[]{}[(){}[]]{[()({})]}(){}{}";
        String param2 = "{({[{([])}]})}{[]}({{{()}}})[({[]})]";
        String param3 = "({[{[{({[]})}]}]}){[{[]}]}([][])()";
        String param4 = "()[]{}[()]{[{}]}{}{()}[()]";
        String param5 = "{[({(())})][{}]{()}}{}[()]{[{}]}";

        assertThat(S1.solution(param1)).isEqualTo(S2.solution(param1));
        assertThat(S1.solution(param2)).isEqualTo(S2.solution(param2));
        assertThat(S1.solution(param3)).isEqualTo(S2.solution(param3));
        assertThat(S1.solution(param4)).isEqualTo(S2.solution(param4));
        assertThat(S1.solution(param5)).isEqualTo(S2.solution(param5));
    }
    @Test
    void no005() {
        Solution_76502_answer S1 = new Solution_76502_answer();
        Solution_76502 S2 = new Solution_76502();

        String param1 = "{[({()}}[()]{[]}{({})[{}][({}(){}[{}])])]{[]}}({{{{{}}}}})";
        String param2 = "({({[()[]{}(){{}()}}[{}])}{[]}){[{}]({[]})}";
        String param3 = "[]{[()]}{{[{}}]}([]{})()";
        String param5 = "({[({[()]}{[(){}]})[({})][()]})]())";

        assertThat(S1.solution(param1)).isEqualTo(S2.solution(param1));
        assertThat(S1.solution(param2)).isEqualTo(S2.solution(param2));
        assertThat(S1.solution(param3)).isEqualTo(S2.solution(param3));


        assertThat(S1.solution(param5)).isEqualTo(S2.solution(param5));
    }
    @Test
    void no10() {
        Solution_76502_answer S1 = new Solution_76502_answer();
        Solution_76502 S2 = new Solution_76502();
        assertThat(S2.solution("[]{[({{{()}}}())()({[]})][{[{[()]}()()]{{}}}{}]}")).isEqualTo(2);
        assertThat(S1.solution("[]{[({{{()}}}())()({[]})][{[{[()]}()()]{{}}}{}]}")).isEqualTo(2);
    }
    @Test
    void no11() {
        Solution_76502 S = new Solution_76502();
        assertThat(S.solution("()[[()()]]")).isEqualTo(2);
    }
}