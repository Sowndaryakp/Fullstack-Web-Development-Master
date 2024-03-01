public class stringConcepts {
    public static void main(String[] args) {
        String name = new String("sowndarya");
        // System.out.println("hello " + name);
        // System.out.println(name.hashCode());
        // System.out.println(name.charAt(3));
        // System.out.println(name.concat(" shetty"));

        ///we can use this one also, here the name will replace, what inside happens in heap memory
        //sonal is already stored in one address, when i again add extra name as "shetty"its goes to another heap memory with 
        //difference address, that address will cal and showing, ur changing address not the data 
        //so the sonal will eligible for garbage collection after sometime it will remove
        // String name1 = "sonal";
        // name1 = name1 + "shetty";
        // System.out.println("hello " + name1);

        //when i give same name its compare in the heap memory its already there then it give same name, means its not again store its constant
        // String s1 = "Navin";
        // String s2 = "Navin";
        // System.out.println(s1==s2);

        //StringBuffer
        StringBuffer sb = new StringBuffer("Sowndarya");
        System.out.println(sb.capacity());//default 16 bytes but when i give name it will add the char count also
        System.out.println(sb.length());//9 bytes
        System.out.println(sb.append(" Shetty"));
        System.out.println(sb.deleteCharAt(2));
        System.out.println(sb.insert(0, "java"));
        //sop
        String str = sb.toString();
        System.out.println(str);
    }
}
