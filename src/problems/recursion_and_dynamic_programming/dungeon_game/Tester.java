package problems.recursion_and_dynamic_programming.dungeon_game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tester {

    @Test
    public void test1(){
        int[][] dungeon = {{-2,-3,3},{-5,-10,1},{10,30,-5}};
        assertEquals(7, Solution.calculateMinimumHP(dungeon));
    }

    @Test
    public void test2(){
        int[][] dungeon = {{1,-4,5,-99},{2,-2,-2,-1}};;
        assertEquals(3, Solution.calculateMinimumHP(dungeon));
    }

    @Test
    public void test3(){
        int[][] dungeon = {{1,-3,3},{0,-2,0},{-3,-3,-3}};;
        assertEquals(3, Solution.calculateMinimumHP(dungeon));
    }
}
