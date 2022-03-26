package com.company;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static com.company.Solution.toCamelCase;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

//
//    public class MyServiceImpl {
//        @Transactional
//        public void method1() {
////do something
//            method2();
//        }
//        @Transactional (propagation=Propagation.REQUIRES_NEW)
//        public void method2() {
////do something
//        }
//    }

    @Test
    public void transformArray() {

        List<String> list = List.of("a", "aa", "aaa", "b", "bb", "bbbb", "abcde");

        List<String> result = list.stream().filter(t->t.length()>2).map(l->l+"->"+l.length()).toList(); //TODO implement
        System.out.println(result);//.toArray());
//        Assertions.assertArrayEquals(new String[]{"aaa->3", "bbbb->4", "abcde->5"}, result.toArray());
    }

    @Test
    public void test() {
        int[] arr = new int[]{12, 3, 1, 15, 20};
        int result = -1;
        Arrays.sort(arr);
        //TODO implement
        result = arr[2];
        assert result == 12;
    }

    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", toCamelCase(input));
    }
}