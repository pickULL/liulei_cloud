package com.liulei.cloud.liuleispringcloudfeigh.controller;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author liulei
 * @date 2020/3/19 11:46
 */
public class A {
    public static void main(String[] args) {
//        List<Integer> a = Arrays.asList(1,3);
//        List<Integer> b = Arrays.asList(2,3);
//        List<Integer> add = add(a, b);
//        Stream<Integer> sorted = add.stream().sorted();
//        List<Integer> collect = sorted.collect(Collectors.toList());
//        collect.forEach(i -> System.out.print(i+" "));
//            Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()){
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            Set<Integer> setA = new TreeSet<Integer>();
//            for(int i = 0; i<a; i++){
//                setA.add(sc.nextInt());
//            }
//            for(int j = 0; j<b; j++){
//                setA.add(sc.nextInt());
//            }
//            for(Integer i:setA){
//                System.out.print(i+" ");
//            }
//        }
        List<String> list = Arrays.asList("Apple", "Banana", "Blackberry", "Coconut", "Avocado", "Cherry", "Apricots");
        Map<String, List<String>> groups = list.stream()
                .collect(Collectors.groupingBy(s -> s.substring(0, 1), Collectors.toList()));
        System.out.println(groups);
        int sum = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).reduce(0, (acc, n) -> acc + n);
        System.out.println(sum); // 45


    }

    public static List<Integer> add(List<Integer> a,List<Integer> b){
        Set<Integer> set = new HashSet<>();
        set.addAll(a);
        set.addAll(b);
        return new ArrayList<>(set);
    }
}
