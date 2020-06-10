import org.graalvm.compiler.lir.LIRInstruction;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class SILab2Test {

    private List<String> createList(String... elems) {
        return new ArrayList<>(Arrays.asList(elems));
    }
    @Test
    void testEveryPath() {
        String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}";
        String num="0123456789";
        String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        RuntimeException ex;
        //1,2, 3, 4, 26
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null,createList("simona","anam","bojan")));
        assertTrue(ex.getMessage().contains("The user is not instantiated"));

        //1,2, 3, 5, 6, 26
        ex=assertThrows(RuntimeException.class, () -> SILab2.function(new User("biloshto",null,"simona.mi@gmail.com"),createList("simona","anam","bojan")));
        assertTrue(ex.getMessage().contains("The user is missing some mandatory information"));

        //1,2, 3, 5, 7,8, 9, 10, 26
        User user=new User("anam","12anam?","ana@yahoo.com");
        assertFalse(user.getUsername().contains(user.getPassword().toLowerCase()));

        //1,2, 3, 5, 7,8, 9, 11, 12, 26
        User user1=new User("anam","12a","ana@yahoo.com");
        assertTrue(user1.getPassword().length() < 8);

        //1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 17, 18, 19, 20, 22, 15.3, 15.2), 23, 24, 26
        user=new User("anam","12Aiisim34","ana@gmail.com");
        assertFalse(user.getPassword().contains(specialCharacters));

        //1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 17, 18, 19, 20, 22, 15.3, 15.2), 23, 25, 26
        //ne e vozmozhno

        //1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 17, 18, 19, 20, 21, 22, 15.3, 15.2), 23, 25, 26
        user=new User("anam","12asmkM.ive?","ana@gmail.com");
        assertFalse(user.getPassword().contains(specialCharacters) && (user.getPassword().contains(num)) && (user.getPassword().contains(upper)));

        //1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 17, 18, 19, 20, 21, 22, 15.3, 15.2), 23, 24, 26
        //ne e vozmozhno da vrakja false(site tri uslovi se ispolneti)

        //1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 17, 18, 20, 21, 22, 15.3, 15.2), 23, 25, 26
        //ne e vozmozhno, ne mozhe da nema golema bukva a da vrati true

        //1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 17, 18, 20, 21, 22, 15.3, 15.2), 23, 24, 26
        user=new User("anam","12mskoadjk!","ana@gmail.com");
        assertFalse(user.getPassword().contains(num) && user.getPassword().contains(specialCharacters));

        //1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 17, 18, 20, 22, 15.3, 15.2), 23, 25, 26
        //ne e vozmozhno da ima samo brojka i da vrati true

        //1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 17, 18, 20, 22, 15.3, 15.2), 23, 24, 26
        user=new User("anam","123456789","ana@gmail.com");
        assertFalse(user.getPassword().contains(num));

        //1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 18, 19, 20, 21, 22, 15.3, 15.2), 23, 25, 26
        //ne e vozmozhno da nema brojka i da vrati true

        //1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 18, 19, 20, 21, 22, 15.3, 15.2), 23, 24, 26
        user=new User("anam","MM?skjd!je","ana@gmail.com");
        assertFalse(user.getPassword().contains(upper) && user.getPassword().contains(specialCharacters));

        //1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 18, 19, 20, 22, 15.3, 15.2), 23, 25, 26
        //ne e vozmozhno samo so golema bukva da vrati true

        //1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 18, 19, 20, 22, 15.3, 15.2), 23, 24, 26
        user=new User("anam","MMMMMAAAAA","ana@gmail.com");
        assertFalse(user.getPassword().contains(upper));

        //1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 18, 20, 21, 22, 15.3, 15.2), 23, 25, 26
        //ne e vozmozhno da ima samo znak i da vrati true

        //1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 18, 20, 21, 22, 15.3, 15.2), 23, 24, 26
        user=new User("anam","$$%mskdke","ana@gmail.com");
        assertFalse(user.getPassword().contains(specialCharacters));

        //1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 18, 20, 22, 15.3, 15.2), 23, 25, 26
        //ne mozhe da nema nitu eden ispolnet uslov i da vrati true

        //1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, (16, 18, 20, 22, 15.3, 15.2), 23, 24, 26
        user=new User("anam","kjdhbewkdj","ana@gmail.com");
        assertTrue(!user.getPassword().contains(num) &&  ! user.getPassword().contains(specialCharacters) && ! user.getPassword().contains(upper));

        //1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, 23, 24, 26
        //ne e vozmozhno

        //1,2, 3, 5, 7,8, 9, 11, 13,14, 15.1, 15.2, 23, 25, 26
        //ne e vozmozhno
    }

    @Test
    void multipleConditionsTest(){
        String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}";
        String num="0123456789";
        String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        RuntimeException ex;
        // if (user.getUsername()==null || user.getPassword()==null)
        //T||X
        ex = assertThrows(RuntimeException.class,
                () -> SILab2.function(new User(null,"536782njwh3","simona.mi@gmail.com"),createList("anam","bojan","simona")));
        assertTrue(ex.getMessage().contains("The user is missing some mandatory information"));

        //F||T
        ex = assertThrows(RuntimeException.class,
                () -> SILab2.function(new User("simmo",null,"simona.mi@gmail.com"),createList("anam","bojan","simona")));
        assertTrue(ex.getMessage().contains("The user is missing some mandatory information"));

        //F||F
        User user=new User("anam","12asmkM.ive?","ana@gmail.com");
        assertFalse(user.getPassword().contains(specialCharacters) && (user.getPassword().contains(num)) && (user.getPassword().contains(upper)));

        //if (!digit || !upper || !special)
        //T||X||X
        user=new User("anam","Akijuhjkijrf.","ana@gmail.com");
        assertTrue(!user.getPassword().contains(num));

        //F||T||X
        user=new User("anam","12mskk.","ana@gmail.com");
        assertFalse( user.getPassword().contains(num) && ! user.getPassword().contains(upper));

        //F||F||T
        user=new User("anam","sIM123","ana@gmail.com");
        assertFalse(user.getPassword().contains(num) && user.getPassword().contains(upper) && ! user.getPassword().contains(specialCharacters));

        //F||F||F
        user=new User("anam","siM?123.M","ana@gmail.com");
        assertFalse(user.getPassword().contains(num) && user.getPassword().contains(upper) && user.getPassword().contains(specialCharacters));

    }
}






