package Inlämninguppgift2_Rekursion;

import java.util.*;

/**
 * Created by Miwa Guhrés
 * Date: 2021-01-18
 * Time: 21:28
 * Project: JavaFuncProg_m
 * Copyright: MIT
 */
public class Tomte {


    public List <String> getNissarByChef(String chef, Map<String,String> map,List<String> list, int counter) {

        for (String key : map.keySet()) {
            if (String.valueOf(map.get(key)).equalsIgnoreCase(chef)) { //Det finns null i value, String.valueOf null-> "null"
                list.add(key);
            }
        }
        while (counter<list.size()) {
            getNissarByChef(list.get(counter), map, list, counter + 1);
            break;
        }
        return list;
    }


    public List<String> getAllChefByNisse(String nisse, Map<String,String> map,List<String> list) {
        while (map.get(nisse) != null) {
            int i = list.size();
            list.add(map.get(nisse));
            getAllChefByNisse(list.get(i), map, list);
            break;
        }
        return list;
    }


    public Tomte(){
        Map<String,String> teamTomte= new HashMap<String ,String >();
        teamTomte.put("Tomten",null);
        teamTomte.put("Glader","Tomten");
        teamTomte.put("Butter","Tomten");
        teamTomte.put("Rådjuret","Butter");
        teamTomte.put("Nyckelpigan","Butter");
        teamTomte.put("Haren","Butter");
        teamTomte.put("Räven","Butter");
        teamTomte.put("Tröger","Glader");
        teamTomte.put("Trötter","Glader");
        teamTomte.put("Blyger","Glader");
        teamTomte.put("Skumtomten","Trötter");
        teamTomte.put("Dammråttan","Skumtomten");
        teamTomte.put("Gråsuggan","Räven");
        teamTomte.put("Myran","Räven");
        teamTomte.put("Bladlusen","Myran");

        // System.out.println(teamTomte.get("Dammråttan"));
        // System.out.println(teamTomte.get(teamTomte.get("Dammråttan")));
        // System.out.println(teamTomte.get(teamTomte.get(teamTomte.get("Dammråttan"))));
        // System.out.println(teamTomte.get(teamTomte.get(teamTomte.get(teamTomte.get("Dammråttan")))));
        // System.out.println(teamTomte.get(teamTomte.get(teamTomte.get(teamTomte.get(teamTomte.get("Dammråttan"))))));






        List<String> list4= new ArrayList<>();
        System.out.println("-----getNissarByChef-Räven-----");
        System.out.println(getNissarByChef("Räven",teamTomte,list4,0));
        System.out.println();

        List<String> list5= new ArrayList<>();
        System.out.println("-----getNissarByChef-Tomten-----");
        System.out.println(getNissarByChef("Tomten",teamTomte,list5,0));
        System.out.println();

        System.out.println("-----getNissarByChef-Butter-----");
        List<String> list6= new ArrayList<>();
        System.out.println(getNissarByChef("Butter",teamTomte,list6,0));
        System.out.println();

        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        System.out.println("-----getAllChefByNisse-Bladlusen----");
        List<String> list= new ArrayList<>();
        System.out.println(getAllChefByNisse("Bladlusen",teamTomte,list));
        System.out.println();

        System.out.println("-----getAllChefByNisse-Dammråttan----");
        List<String> list2= new ArrayList<>();
        System.out.println(getAllChefByNisse("Dammråttan",teamTomte,list2));
        System.out.println();

        System.out.println("-----getAllChefByNisse-Myran----");
        List<String> list3= new ArrayList<>();
        System.out.println(getAllChefByNisse("Myran",teamTomte,list3));

    }


    public static void main(String[] args) {

        Tomte t= new Tomte();

    }
}

